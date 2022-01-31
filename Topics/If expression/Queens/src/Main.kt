import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val x1 = scanner.next().toInt()
    val y1 = scanner.next().toInt()
    val x2 = scanner.next().toInt()
    val y2 = scanner.next().toInt()

    if (x1 == x2 || y1 == y2 || abs(x1 - x2) == abs(y1 - y2)) {
        println("YES")
    } else println("NO")

}