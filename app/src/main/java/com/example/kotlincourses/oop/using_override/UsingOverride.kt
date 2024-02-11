package com.example.kotlincourses.oop.using_override

fun main() {
    val animal = Animal()
    val mammal = Mammal()
    val cat = Cat()
    val dog = Dog()

    animal.makeSound()
    mammal.makeSound()
    cat.makeSound()
    dog.makeSound()
}