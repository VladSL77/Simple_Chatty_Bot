// You can experiment here, it won’t be checked


import java.util.Scanner


fun main() {
  val scanner = Scanner(System.`in`)

  println("Hello! My name is Ada.")
  println("I was created in 2022.")
  println("Please, remind me your name.")

  val name = scanner.nextLine()

  println("What a great name you have, $name!")
  println("Let me guess your age.")
  println("Enter remainders of dividing your age by 3, 5 and 7.")
  val remainder3 = scanner.nextLine().toInt()
  val remainder5 = scanner.nextLine().toInt()
  val remainder7 = scanner.nextLine().toInt()
  val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
  println("Your age is $age; that's a good time to start programming!")
}