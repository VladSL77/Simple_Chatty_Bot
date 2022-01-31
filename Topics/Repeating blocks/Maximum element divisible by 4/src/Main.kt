fun main() {
    val count = readLine()!!.toInt()
    var max = 0
    var number = 0
    repeat(count) {
        number = readLine()!!.toInt()
        if (number % 4 == 0 && number > max) max = number
    }
    print(max)
}