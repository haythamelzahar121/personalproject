package BreakAndContinue

fun main(args: Array<String>) {

    for (c in "Python") {
        if (c == 'o'){
            break
        }
    print(c)
    }

    println()

    val list = listOf("book", "table", "laptop")

    for (x in list) {
        if (!x.contains('o')) {
            continue
        }
        println(x)
    }
}