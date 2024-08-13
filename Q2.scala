package prac08_22001816

import scala.io.StdIn
object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter the number which you want to categorize: ")
    val number = StdIn.readLine().toInt

    def categorize(n: Int): String = n match {
      case _ if n % 3 == 0 && n % 5 == 0 => "multiple of three and five"
      case _ if n % 3 == 0 => "multiple of three"
      case _ if n % 5 == 0 => "multiple of five"
      case _ => "not a multiple of three or five"
    }

    val result = categorize(number)
    println(result)
  }
}
