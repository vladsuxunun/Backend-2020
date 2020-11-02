import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import org.slf4j.{Logger, LoggerFactory}

import scala.util.Try


object Main {

  def main(args: Array[String]): Unit = {

  implicit val log: Logger = LoggerFactory.getLogger(getClass)

  val rootBehavior = Behaviors.setup[Nothing] { context =>

    val addresses: Seq[AddressBook] = Seq(
      AddressBook("1", "Vladislav", "Orbita-1", true),
      AddressBook("2", "Anuar", "Zhibek-Zholy", false),

    )

    val AddressBookRepository = new InMemoryAddressBookRepository(addresses)(context.executionContext)
    val router = new MyRouter(AddressBookRepository)(context.system, context.executionContext)

    val host = "0.0.0.0"
    val port = Try(System.getenv("PORT")).map(_.toInt).getOrElse(9000)

    Server.startHttpServer(router.route, host, port)(context.system, context.executionContext)
    Behaviors.empty
  }
  val system = ActorSystem[Nothing](rootBehavior, "HelloAkkaHttpServer")
}

}
