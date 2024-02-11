package com.example.kotlincourses.oop

fun main() {
    val bmw = Car("Beyaz", 0,false)

    bmw.getInfo()

    bmw.speed = 10
    bmw.isWork = true

    bmw.getInfo()
    bmw.stop()
    bmw.getInfo()
    bmw.work()
    bmw.getInfo()
    bmw.speedUp(30)
    bmw.getInfo()
    bmw.slowDown(10)
    bmw.getInfo()


    val sahin = Car("Kırmızı", 100,true)

    sahin.getInfo()
    sahin.stop()
    sahin.getInfo()
    sahin.work()
    sahin.getInfo()
    sahin.speedUp(30)
    sahin.getInfo()
    sahin.slowDown(10)
    sahin.getInfo()
}