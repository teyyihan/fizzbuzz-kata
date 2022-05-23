import java.util.*

const val FIZZ = "Fizz"
const val BUZZ = "Buzz"
const val EMPTY_STRING = ""

fun main(args: Array<String>) {
    val number = getNumberFromUser()

    val result = solveFizzBuzz(number)

    println("Random number is $number, so it's $result")
}

fun solveFizzBuzz(number: Int): String {
    var result = EMPTY_STRING

    if(divisibleByThree(number))
        result += FIZZ

    if(divisibleByFive(number))
        result += BUZZ

    return result
}

fun getNumberFromUser(): Int {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    return reader.nextInt()
}

fun divisibleByThree(number: Int): Boolean =  number % 3 == 0

fun divisibleByFive(number: Int): Boolean =  number % 5 == 0