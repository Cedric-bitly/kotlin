// fun main(args: Array<String>) {
//     print("Hello there. Kotlin Works.")
// }

// Program 3: Looping Structures and Arrays in Kotlin

fun main() {
    println("=== CREATING ARRAYS IN KOTLIN ===\n")
    
    // Method 1: Using arrayOf()
    val fruits = arrayOf("Apple", "Banana", "Orange", "Mango")
    println("Array created with arrayOf(): ")
    println(fruits.contentToString())
    
    // Method 2: Using Array constructor
    val numbers = Array(5) { i -> i * 2 }  // [0, 2, 4, 6, 8]
    println("\nArray with constructor (multiples of 2): ")
    println(numbers.contentToString())
    
    // Method 3: IntArray (specific type)
    val intArray = IntArray(5) { it + 1 }  // [1, 2, 3, 4, 5]
    println("\nIntArray: ")
    println(intArray.contentToString())
    
    println("\n\n=== LOOPING STRUCTURES ===\n")
    
    // 1. FOR LOOP - Range
    println("1. For loop with range (1 to 5):")
    for (i in 1..5) {
        print("$i ")
    }
    println("\n")
    
    // 2. FOR LOOP - Iterating array
    println("2. For loop iterating array:")
    for (fruit in fruits) {
        println("  - $fruit")
    }
    println()
    
    // 3. FOR LOOP - With index
    println("3. For loop with index:")
    for (i in fruits.indices) {
        println("  Index $i: ${fruits[i]}")
    }
    println()
    
    // 4. FOR LOOP - With step
    println("4. For loop with step (0 to 10, step 2):")
    for (i in 0..10 step 2) {
        print("$i ")
    }
    println("\n")
    
    // 5. FOR LOOP - Downward
    println("5. For loop downward (5 down to 1):")
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println("\n")
    
    // 6. WHILE LOOP
    println("6. While loop (count 1 to 5):")
    var count = 1
    while (count <= 5) {
        print("$count ")
        count++
    }
    println("\n")
    
    // 7. DO-WHILE LOOP
    println("7. Do-While loop (count 1 to 5):")
    var counter = 1
    do {
        print("$counter ")
        counter++
    } while (counter <= 5)
    println("\n")
    
    // 8. forEach LOOP
    println("8. forEach loop:")
    intArray.forEach { num ->
        print("$num ")
    }
    println("\n")
    
    // 9. REPEAT LOOP
    println("9. Repeat loop (repeat 5 times):")
    repeat(5) { index ->
        print("${index + 1} ")
    }
    println()
}