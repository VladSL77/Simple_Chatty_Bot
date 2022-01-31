// You can experiment here, it won’t be checked


const val A = 5
const val B = 4
const val C = 3
const val D = 2

fun main() {
    // put your code here
    var sumA = 0
    var sumB = 0
    var sumC = 0
    var sumD = 0
    val count = readLine()?.toInt()!!
    repeat(count) {
        when (readLine()?.toInt()!!) {
            A -> sumA++
            B -> sumB++
            C -> sumC++
            D -> sumD++
            else -> {
                println("It`s not grade")
            }
        }
    }
    print("$sumD $sumC $sumB $sumA")
}
