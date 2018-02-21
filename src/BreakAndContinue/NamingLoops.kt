package BreakAndContinue

fun main(args: Array<String>) {


    for (a in 1..10){
        for (b in 1..10){
            if (a - b == 5){
                break
            }
            println("$a - $b")
        }
    }

    println()

    outer@ for (a in 1..10){
        for (b in 1..10){
            if (a - b == 5){
                break@outer
            }
            println("$a - $b")
        }
    }
}