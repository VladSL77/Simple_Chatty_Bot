fun main() {
    // write your code here
    val range1 = readLine()!!.toInt()..readLine()!!.toInt()
    val range2 = readLine()!!.toInt()..readLine()!!.toInt()
    val number = readLine()!!.toInt()
    println(number in range1 && number in range2)
}