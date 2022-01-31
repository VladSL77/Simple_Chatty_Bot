fun main() {
    val count = readLine()!!.toInt()
    var larger = 0
    var normal = 0
    var smaller = 0
    var size: Int
    repeat(count) {
        size = readLine()!!.toInt()
        if (size < 0) smaller++ else if (size == 0) normal++ else larger++
    }
    print("$normal $larger $smaller")
}