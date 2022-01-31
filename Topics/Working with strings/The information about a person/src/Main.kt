import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val firstName = scanner.next().toString()
    val secondName = scanner.next().toString()
    val age = scanner.next().toString()
    println("${firstName.first()}. $secondName, $age years old")
}