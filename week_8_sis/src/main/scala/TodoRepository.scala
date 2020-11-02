import scala.concurrent.{ExecutionContext, Future}

trait TodoRepository {
  def all(): Future[Seq[Todo]]
  def done(): Future[Seq[Todo]]
}


class InMemoryTodoRepository(todo:Seq[Todo] = Seq.empty)(implicit  ex:ExecutionContext) extends TodoRepository {
  private var todos: Vector[Todo] = todo.toVector

  override def all(): Future[Seq[Todo]] = Future.successful(todos)
  override def done(): Future[Seq[Todo]] = Future.successful(todos.filter(_.done))
}