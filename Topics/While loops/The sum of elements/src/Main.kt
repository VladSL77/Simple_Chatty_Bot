fun main() {
    var number = readLine()!!.toInt()
    var sum = 0
    while (number != 0) {
        sum += number
        number = readLine()!!.toInt()
    }
    println(sum)
}
