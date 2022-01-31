import java.util.Scanner

const val LOW_VALUE = 1
const val HI_VALUE = 4

fun main() {
    val scanner = Scanner(System.`in`)
    for (i in LOW_VALUE..HI_VALUE) {
        println(scanner.nextInt())
    }
}