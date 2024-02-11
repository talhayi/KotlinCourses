package com.example.kotlincourses.homework2

class Homework2 {

    fun question1CalculateInteriorAngle(numberSide: Int) : String{
        if (numberSide < 3){
            return "Kenar sayısı 3 den küçük olamaz"
        }
        val sumInteriorAngles = ((numberSide - 2) * 180) / numberSide
        println("Soru1, Kenar sayısı $numberSide olan çokgenin iç açısı $sumInteriorAngles'dir. \n       İç açıları toplamı ${sumInteriorAngles * numberSide}'dir.")
        return sumInteriorAngles.toString()
    }

    fun question2CalculateSalary(day: Int): Int{
        val workHours = day * 8
        return if (workHours > 150) {
            val hourlyRate = 150 * 40
            val overtimeRate = (workHours - 150) * 80
            hourlyRate + overtimeRate
        }else{
            workHours * 40
        }
    }

    fun question3CalculateParkingFee(howManyHours: Int) : Int {
        var fee = 50
        for (i in 2..howManyHours) {
            fee += 10
        }
        return fee
    }

    fun question4MileCalculation(km: Double): Double {
        return km * 0.621
    }

    fun question5RectangleArea(shortEdge: Int, longEdge: Int){
        val area = shortEdge * longEdge
        println("Soru5, Dikdörtgenin alanı $area'dır.")
    }

    fun question6Factorial(number: Int): Int{
        var fac = 1
        if (number == 0){
            return 1
        }
        for (i in number downTo 1){
            fac *= i
        }
        return fac
    }

    fun question7howManyE(word: String){
        var count = 0
        val wordLowercase = word.lowercase()
        val charWord = wordLowercase.toCharArray()
        for (i in charWord.indices){
            if (charWord[i] == 'e'){
                count += 1
            }
        }
        println("Soru7, $count adet e harfi bulunmaktadır.")
    }
}