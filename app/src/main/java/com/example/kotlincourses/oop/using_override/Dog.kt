package com.example.kotlincourses.oop.using_override

class Dog: Mammal() {

    override fun makeSound() {
        println("Hav Hav")
    }
}