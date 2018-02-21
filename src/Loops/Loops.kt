package Loops

fun main(args: Array<String>) {

    //generate a loop which adds all the number together from 1 - 100

    var y = 0

    for (x in 1..100) {
        y = y + x
    }

    println(y)
    //generate a loop which displays the names
    val list = listOf("hey", "mike", "jack")

    for (x in list) {
        println(x)
    }

    //generate a loop which displays the names with indexes
    for ((index,value) in list.withIndex())
    {
        println("Element at $index has $value")
    }
}