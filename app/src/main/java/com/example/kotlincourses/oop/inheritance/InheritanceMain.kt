package com.example.kotlincourses.oop.inheritance

fun main() {
    val topkapiPalace = Palace(5, 100)
    val straitVilla = Villa(true, 50)

    println(topkapiPalace.numberTowers)
    println(topkapiPalace.numberWindows)
    println(straitVilla.isThereGarage)
    println(straitVilla.numberWindows)
}