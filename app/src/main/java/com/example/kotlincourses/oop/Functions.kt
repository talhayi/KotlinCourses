package com.example.kotlincourses.oop

class Functions {

    fun hello(){
        val result = "Hello Talha"
        println(result)
    }

    fun hello2(): String {
        return "Hello Talha"
    }

    fun hello3(name: String){
        val result = "Hello $name"
        println(result)
    }

    fun multiply(number1: Int, number2: Int){
         println("Multiply: ${number1 * number2}")
    }

    fun multiply(number1: Double, number2: Int){
        val result = number1 * number2
        println("Multiply: $result")
    }

    fun multiply(number1: Int, number2: Int, name: String){
        val result = number1 * number2
        println("Multiply: $result, işlem yapan: $name")
    }

}