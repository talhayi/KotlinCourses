package com.example.kotlincourses.oop

import com.example.kotlincourses.oop.MyClass.Companion.method
import com.example.kotlincourses.oop.MyClass.Companion.x

fun main() {
    val myClass = MyClass()
 /*   println(myClass.x)
    myClass.method()*/

    //Nameless object
    //Virtual object
/*    println(MyClass().x)
    MyClass().method()*/

    //Static-Companion Object
    println(x)
    method()

}