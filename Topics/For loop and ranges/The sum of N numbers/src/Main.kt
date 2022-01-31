
const val ONE = 1

fun main() {
    // write your code here
    val number = readLine()!!.toInt()
    var sum = 0
    for (i in ONE..number) {
        sum += readLine()!!.toInt()
    }
    println(sum)
}