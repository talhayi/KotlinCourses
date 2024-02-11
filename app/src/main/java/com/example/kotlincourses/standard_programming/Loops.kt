package com.example.kotlincourses.standard_programming

fun main() {
    for (i in 1..3) {
        println("$i .loop")
    }

    for (j in 10..20 step 5) {
        println("$j .loop 2")
    }

    for (k in 20 downTo 10 step 5) {
        println("$k .loop 3")
    }

    var count = 1
    while (count < 4) {
        println("$count .loop 4")
        count++
    }

    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println("$i .loop5")
    }

    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println("$i .loop6")
    }

}