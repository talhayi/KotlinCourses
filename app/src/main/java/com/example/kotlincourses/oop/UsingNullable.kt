package com.example.kotlincourses.oop

fun main() {

    var message: String? = null

    //Method1
    println("Method 1: ${message?.uppercase()}")

    //Method2
    //println("Method 2: ${message!!.uppercase()}")

    //Method3
    if (message != null){
        println("Method 3: ${message.uppercase()}")
    } else {
        println("Method 3 null'dır")
    }

    //Method 4

    message?.let {
        println("Method 4: ${message.uppercase()}")
    }


}