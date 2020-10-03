import scala.util.matching.Regex
import scala.io.Source

object Main extends {


    val bufferedSource = io.Source.fromFile("raw.txt")
    val lines = (for (line <- bufferedSource.getLines()) yield line).toList
    bufferedSource.close
    lines


  val fil: Regex = "^Филиал.*".r
  val bin: Regex = "^БИН.*".r
  val cassa:Regex = "^Касса.*".r
  val smena:Regex = "^Смена.*".r
  val check:Regex = "^Чек.*".r
  val kassir:Regex = "^Кассир.*".r

  val match1 = fil.findFirstIn(lines[i])










}

