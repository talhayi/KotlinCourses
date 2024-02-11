package com.example.kotlincourses.oop.using_interface

class IClass: MyInterface {
    override val variable: Int = 10

    override fun method1() {
        println("Method1 worked")
    }

    override fun method2(): String {
        return "Method2 worked"
    }
}