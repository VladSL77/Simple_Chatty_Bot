import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var nextNumber: Int
    val array = arrayListOf<Int>()
    while (scanner.hasNext()) {
        nextNumber = scanner.nextInt()
        array.add(nextNumber)
        if (nextNumber >= max) max = nextNumber
    }
    println("$max ${array.indexOf(max) + 1}")
}