package com.example.kotlincourses.oop

fun main() {
    val functions = Functions()
    functions.hello()

    val getResult = functions.hello2()
    println("Result: $getResult")

    functions.hello3("Sefa")

    functions.multiply(30, 40, "Talha")

    val result = 5 multiply 2
    println("Multiply: $result")
}

infix fun Int.multiply(number: Int) : Int {
    return this * number
}