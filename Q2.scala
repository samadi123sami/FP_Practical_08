package prac08_22001816

object Q2 {
    def main(args: Array[String]): Unit = {
      // Check if there is exactly one input argument
      if (args.length != 1) {
        println("Please provide exactly one integer as input.")
        return
      }

      // Parse the input string to an integer
      val input = try {
        args(0).toInt
      } catch {
        case _: NumberFormatException =>
          println("Please provide a valid integer.")
          return
      }

      // Define a function that categorizes the input number
      val categorize: Int => String = {
        case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
        case n if n % 3 == 0 => "Multiple of Three"
        case n if n % 5 == 0 => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"
      }

      // Print the result of categorization
      println(categorize(input))
    }
  }
