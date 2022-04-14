package com.xbach.prak26

import kotlin.random.Random
import kotlin.random.nextInt

object RandomNumber {
    private var number:Int=0

    fun setRandomNumber(){
        number= Random.nextInt(0..50)
    }

    fun getRandomNumber():Int{
        return number
    }
}
