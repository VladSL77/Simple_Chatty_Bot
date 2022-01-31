fun main() {
    var result = readLine()!!.toInt()
    var string = "$result "
    while (result != 1) {
        if (result % 2 == 0) {
            result /= 2
            string += "$result "
        } else {
            result *= 3
            result++
            string += "$result "
        }
    }
    print(string.trim())
}