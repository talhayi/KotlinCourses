package com.example.kotlincourses.variables

fun main() {
    println("Hello World")
    var name = "Talha"
    var age = 3
    var height = 1.86
    var letter = 'T'
    var isAttendance = true

    println("Name           : $name")
    println("Age            : $age")
    println("Height         : $height")
    println("Letter         : $letter")
    println("isAttendance   : $isAttendance")

    var a = 10
    var b = 20

    println("$a x $b = ${ a * b}")

    //constants
    var number = 30
    println(number)
    number = 100
    println(number)

    val i = 42
    val d = 87.93

    val result1 = i.toDouble()
    val result2 = d.toInt()

    println(result1)
    println(result2)

    val result3 = i.toString()
    val result4 = d.toString()

    println(result3)
    println(result4)

    val word = "43t"
    val result5 = word.toIntOrNull()

    if (result5 != null){
        println(result5)
    }else{
        println("NumberFormatException")
    }

    result5?.let {
        println(it)
    }


}