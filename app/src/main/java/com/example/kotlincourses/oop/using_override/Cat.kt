package com.example.kotlincourses.oop.using_override

class Cat: Mammal() {
    override fun makeSound() {
        println("Miyav Miyav")
    }
}