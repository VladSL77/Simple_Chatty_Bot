fun main() {
    var count = 0
    var next = readLine()!!.toInt()
    while (next != 0) {
        count++
        next = readLine()!!.toInt()
    }
    print(count)
}