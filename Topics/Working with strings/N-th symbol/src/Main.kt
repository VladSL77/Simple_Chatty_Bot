fun main() {
    val string = readLine().toString()
    val number = readLine()?.toInt()
    println("Symbol # $number of the string \"$string\" is \'${string[number!! - 1]}\'")
}