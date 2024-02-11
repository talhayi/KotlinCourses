package com.example.kotlincourses.standard_programming

fun main() {
    val age = 18
    val name = "Talha"

    if (age >= 18){
        println("Adult")
    } else{
        println("Not Adult")
    }

    if (name == "Talha"){
        println("Hello Talha")
    } else if(name == "Mehmet"){
        println("Hello Mehmet")
    }else{
        println("Unknown Person")
    }

    val ta = "admin"
    val l = 123456

    if (ta == "admin" && l == 123456){
        println("Welcome")
    }else{
        println("incorrect login")
    }

    val number = 10

    if (number == 10 || number == 20){
        println("number is 10 or 20")
    }else{
        println("number is not 10 or 20")
    }

    val result = 10
    when(result){
        10-> println("result: 10")
        20-> println("result: 20")
        30-> println("result: 30")
        else -> println("Not result")
    }

}