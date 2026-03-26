fun main() {
    // for loop -> it is used to execute a block of code/statement repeatedly for a fixed number of times until a condition is met

    for (number in 1..10) {
        println("The count is: $number") 
    }

    println("================================")
    
    // create a for loop to print from 50 to 65)
    for (num in 50..65){
        println("The number is: $num")
    }

    println("================================")

    // how to increment on the for loop by use of steps for odd numbers from 20 to 40
    for (x in 20..40 step 2) {
        println("The count is: $x")
    }

    println("================================")

    // below we find the odd number in the given range
    for (y in 21..39){
        if(y % 2 != 0){
            println(y)
        }
    }

    println("================================")

    //  // By use of a for loop, generate the multiplication table for 5 from 1 to 5.
    val number = 5
    for (i in 1..5) {
        println("$number x $i = ${number * i}")
    }
 
    println("================================")

    // Create a program that is able to find the factorial of five
    val n = 5
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    println("The factorial of $n is: $factorial")

}
