import java.util.Scanner

object Main {
  def main(args: Array[String]): Unit = {
    print("введите число:")
    val a = scala.io.StdIn.readInt()
    print("введите операцию (* / - +:")
    val b = scala.io.StdIn.readLine()
    print("введите  второе число:")
    val cc = scala.io.StdIn.readInt()
    if( b.equals("+"))
    {
      var j = a + cc
      println(j)
    }

    else if (b.equals("-"))
    {
      var j = a - cc
      println(j)
    }
    else if (b.equals("*"))
    {
      var j = a * cc
      println(j)
    }
    else if (b.equals("/"))
    {
      var j = a / cc
      println(j)
    }
    else{
      print("неверная операция")
    }




  }

}
