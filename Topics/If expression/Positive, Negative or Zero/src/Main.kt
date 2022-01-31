fun main() {
    val num = readLine()!!.toInt()
    if (num < 0) print("negative") else if (num == 0) print("zero") else print("positive")
}