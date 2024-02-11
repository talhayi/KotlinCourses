package com.example.kotlincourses.oop

data class Car (var color: String, var speed: Int, var isWork: Boolean){

    fun getInfo(){
        println("----------------------")
        println("Color      : $color")
        println("Speed      : $speed")
        println("IsWork     : $isWork")
    }

    fun work(){
        isWork = true
        speed = 5
    }

    fun stop(){
        isWork = false
        speed = 0
    }

    fun speedUp(km: Int){
        speed += km
    }

    fun slowDown(km: Int){
        speed -= km
    }


}