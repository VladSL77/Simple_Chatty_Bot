fun main() {
    val number = readLine()!!.toInt()
    if (number in -14..12 || number in 15..16 || number > 18) print("True") else print("False")
}