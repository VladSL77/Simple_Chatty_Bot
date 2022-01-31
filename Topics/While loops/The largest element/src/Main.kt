fun main() {
    var max = 0
    var next = readLine()!!.toInt()
    while (next != 0) {
        if (next > max) {
            max = next
        }
        next = readLine()!!.toInt()
    }
    print(max)
}