fun main() {
    var cost: Int
    var ok = true
    var balance = readLine()!!.toInt()
    val expense = readLine()!!.split(" ")
    var i = 0
    while (i < expense.size) {
        cost = expense[i].toInt()
        if (balance >= cost) {
            balance -= cost
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $cost.")
            ok = false
            break
        }
        i++
    }
    if (ok) println("Thank you for choosing us to manage your account! Your balance is $balance.")
}