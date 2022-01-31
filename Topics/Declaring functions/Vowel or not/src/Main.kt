// write your function here

val arrayVowel = arrayOf('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')

fun isVowel(char: Char): Boolean = arrayVowel.contains(char)

fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}