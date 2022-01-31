
const val MIN_AGE = 18
const val MAX_AGE = 59

fun main() {
    println(readLine()!!.toInt() in MIN_AGE..MAX_AGE)
}