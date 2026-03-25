fun main() {
    val marks = 74

    if (marks >0 && marks < 30){
        println("Your grade is F")
    } else if (marks >= 30 && marks <= 39){
        println("Your grade is E")
    } else if (marks >= 40 && marks <= 49){
        println("Your grade is D")
    } else if (marks >= 50 && marks <= 59){
        println("Your grade is C")
    } else if (marks >= 60 && marks <= 69){
        println("Your grade is B")
    } else if (marks >= 70 && marks <= 100){
        println("Your grade is A")
    } else {
        println("Invalid marks")
    }
}