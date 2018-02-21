package Conditionals

fun main(args: Array<String>) {
    var x: Int = 16

    when (x) {
        in 1..10 -> println("hi")
        in 11..20 -> println("oi")
    }


    when (x) {
        !in 1..11 -> println("test")
    }

}