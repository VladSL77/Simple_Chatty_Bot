fun main() {
    var count = readLine()!!.toInt()
    var number = 1
    if (count > 0) print("$number")
    while (count > 1) {
        number++
        repeat(number) {
            if (count > 1) {
                print(" $number")
                count--
            }
        }
    }
}