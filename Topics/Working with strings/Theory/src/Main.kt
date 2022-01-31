import java.util.*

// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val string = readLine().toString()
    val number = readLine()?.toInt()
    println("Symbol # $number of the string \"$string\" is \'${string[number!! - 1]}\'")
}
