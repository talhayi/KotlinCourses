package com.example.kotlincourses.oop.composition

data class Films (
    var filmId: Int,
    var filmName: String,
    var filmYear: Int,
    var category: Categories,
    var direction: Directions
)