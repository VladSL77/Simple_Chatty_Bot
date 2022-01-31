
const val MIN = 1

fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var x = MIN
    var sqr = x
    while (sqr <= n) {
        println(sqr)
        x++
        sqr = x * x
    }

}