import java.util.*

fun main(args: Array<String>) {

    val (x1, y1, z1) = readLine()!!.split(" ").map(String::toInt).sorted()
    val (x2, y2, z2) = readLine()!!.split(" ").map(String::toInt).sorted()

    if (x1 == x2 && y1 == y2 && z1 == z2) println("Box 1 = Box 2")
    else {
        if ((x1 <= x2 && y1 <= y2 && z1 <= z2) || (x1 <= x2 && y1 <= z2 && z1 <= y2)) println("Box 1 < Box 2")
        else {
            if ((x1 >= x2 && y1 >= y2 && z1 >= z2) || (x1 >= x2 && y1 >= z2 && z1 >= y2)) println("Box 1 > Box 2")
            else println("Incomparable")
        }
    }
}
