package Conditionals
import java.util.Random

fun main(args: Array<String>) {
    val random = Random().nextInt(50)
    when(random){
        in 0..10 -> println("the range is 1-10: " + random)
        in 11..20 -> println("the range is 11-20: " + random)
        in 21..30 -> println("the range is 21-30: " + random)
        else -> println("greater than 30: " + random)
    }
}