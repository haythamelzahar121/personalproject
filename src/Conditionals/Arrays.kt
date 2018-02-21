package Conditionals
import java.util.Random


fun main(args: Array<String>) {
    val array1 = arrayOf("test", "test1", "test2")
    val mixed = arrayOf("test", 17, 3.0, false)
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    println(mixed[0])
    mixed[2] = 39
    println(mixed[2])

    val string = "djkfjgjfdgdfghhjdfgjf"
    println(string[5])

//    //combining two arrays
//    val allStates = array1 + numbers
//    println(allStates)

    println(array1.size)

    val checkEmpty: Boolean = array1.isEmpty()

    if (mixed.contains("hello")) {
        println("the array contains Hello")
    } else {
        println("doesn't contain")
    }

    println(checkEmpty)

    val list = listOf("orange", "apples", "bananas")

    val arraylist = arrayListOf("hello", "hello1", "hello2")
    val addingName = arraylist.add(2, "josh")

    arraylist.add("billy")

    val removingName = arraylist.remove("hello2")
    println(removingName)

    println(arraylist)


    val sublist = arraylist.subList(0,2)
    println(sublist)
}

