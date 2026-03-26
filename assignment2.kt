// Program 2: Check if a number is Odd or Even

fun main() {
    val number = 15  // Change this value to test different numbers
    
    if (number % 2 == 0) {
        println("$number is EVEN")
    } else {
        println("$number is ODD")
    }
    
    // Test multiple numbers
    println("\nTesting multiple numbers:")
    val numbers = arrayOf(10, 15, 22, 7, 0, -5, 100, 99)
    for (num in numbers) {
        if (num % 2 == 0) {
            println("$num is EVEN")
        } else {
            println("$num is ODD")
        }
    }
}