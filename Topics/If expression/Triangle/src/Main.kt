fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    if (a + b <= c || a + c <= b || c + b <= a) print("NO") else print("YES")
}