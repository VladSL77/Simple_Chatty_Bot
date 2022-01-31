const val ONE = 1
const val SIX = 6

fun main() {
    var s = "#"
    for (i in ONE..SIX) {
        println(s)
        s += "#"
    }
}