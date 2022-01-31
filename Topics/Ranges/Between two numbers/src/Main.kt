fun main() {
    // write your code here
    val number = readLine()!!.toInt()
    val range = readLine()!!.toInt()..readLine()!!.toInt()
    println(number in range)
}