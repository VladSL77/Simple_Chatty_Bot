import kotlin.math.abs
fun main() {
    // write your code here
    val (x1, y1) = readLine()!!.split(" ")
    val (x2, y2) = readLine()!!.split(" ")
    val x = abs(x1.toInt() - x2.toInt())
    val y = abs(y1.toInt() - y2.toInt())

    if (x == 1 && y == 2 || y == 1 && x == 2) {
        println("YES")
    } else {
        println("NO")
    }
}
