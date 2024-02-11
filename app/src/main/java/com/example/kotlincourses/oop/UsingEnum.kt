package com.example.kotlincourses.oop


fun main() {
    feeCalculate(100, CanDimension.SMALL)
}

fun feeCalculate(quantity: Int, canDimension: CanDimension) {
    when (canDimension) {
        CanDimension.SMALL -> println("Total Cost ${quantity * 30} ₺")
        CanDimension.MEDIUM -> println("Total Cost ${quantity * 40} ₺")
        CanDimension.LARGE -> println("Total Cost ${quantity * 50} ₺")
    }
}

