import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.LoggerOps
import akka.actor.typed.{ ActorRef, ActorSystem, Behavior }

object CalcActor1 {
  final case class Get(whom: String,num: Int, replyTo: ActorRef[Got])
  final case class Got(whom: Int, from: ActorRef[Get])

  def apply(): Behavior[Get] = Behaviors.receive { (context, message) =>
    println(s"введите число ")
    var firstnum = scala.io.StdIn.readInt()
    message.replyTo ! Got(firstnum, context.self)
    Behaviors.same
  }
}

object CalcActor2 {

  def apply(max: Int): Behavior[CalcActor1.Got] = {
    bot()
  }

  private def bot(): Behavior[CalcActor1.Got] =
    Behaviors.receive { (context, numbs) =>
      println(print("введите операцию (* / - +:"))
      val b = scala.io.StdIn.readLine()
      println(s"введите число ")
      val secnumber = scala.io.StdIn.readInt()
      if( b.equals("+"))
      {
        var j = numbs.whom + secnumber
        println(j)
      }

      else if (b.equals("-"))
      {
        var j = numbs.whom - secnumber
        println(j)
      }
      else if (b.equals("*"))
      {
        var j = numbs.whom * secnumber
        println(j)
      }
      else if (b.equals("/"))
      {
        var j = numbs.whom / secnumber
        println(j)
      }
      else{
        print("неверная операция")
      }
        Behaviors.stopped

    }
}

object CalcActor1Main {

  final case class SayHello(name: String)

  def apply(): Behavior[SayHello] =
    Behaviors.setup { context =>
      val Geter = context.spawn(CalcActor1(), "Geter")

      Behaviors.receiveMessage { message =>
        val replyTo = context.spawn(CalcActor2(max = 2), message.name)
        var r = 0
        Geter ! CalcActor1.Get(message.name,r, replyTo)
        Behaviors.same
      }
    }

  def main(args: Array[String]): Unit = {
    val system: ActorSystem[CalcActor1Main.SayHello] =
      ActorSystem(CalcActor1Main(), "hello")

    system ! CalcActor1Main.SayHello("---")
  }
}

