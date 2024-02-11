package com.example.kotlincourses.oop.composition

fun main() {
    val k1 = Categories(1,"Drama")
    val k2 = Categories(2,"Science")

    val y1 = Directions(1,"Q. Tarantino")
    val y2 = Directions(2,"C. Nolan")

    val f1 = Films(1,"Django", 2013, k1, y1)

    println("Film Id: ${f1.filmId}")
    println("Film Name: ${f1.filmName}")
    println("Film Year: ${f1.filmYear}")
    println("Film Category: ${f1.category.categoryName}")
    println("Film Direction: ${f1.direction.directionName}")

}