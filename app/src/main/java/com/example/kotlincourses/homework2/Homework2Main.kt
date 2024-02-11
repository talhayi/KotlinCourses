package com.example.kotlincourses.homework2

fun main() {
    val homework2 = Homework2()
    homework2.question1CalculateInteriorAngle(6)
    println("Soru2, Maaş Ücreti : ${homework2.question2CalculateSalary(20)} ₺'dir.")
    println("Soru3, Otopark Ücretiniz : ${homework2.question3CalculateParkingFee(3)} ₺'dir.")
    println("Soru4, Mil Hesaplama: ${homework2.question4MileCalculation(100.0)}")
    homework2.question5RectangleArea(5,8)
    println("Soru6, Faktöriyel : ${homework2.question6Factorial(5)}'dir.")
    homework2.question7howManyE("TalhaewwweeedeeE")
}