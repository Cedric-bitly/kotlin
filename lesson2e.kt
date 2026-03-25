// When statement
// The when statement in Kotlin is like a switch case in other languages. It checks the values against multiple conditions and executes the matching block

fun main() {
    val marks = 82

    when (marks) {
        in 1..30 -> println("You failed")
        in 31..50 -> println("You have Average marks")
        in 51..70 -> println("Your are above average")
        in 71..100 -> println("Your passed")
        else -> println("Invalid marks")
    }
}