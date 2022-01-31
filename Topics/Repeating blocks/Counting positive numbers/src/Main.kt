fun main() {
    val count = readLine()!!.toInt()
    var n = 0
    repeat(count) {
        if (readLine()!!.toInt() > 0) n++
    }
    print(n)
}