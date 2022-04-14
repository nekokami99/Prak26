package com.xbach.prak26

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random
import kotlin.random.nextInt

class RandomViewModel:ViewModel() {
    val number = MutableLiveData<Int>()

    fun randomNum() {
        RandomNumber.setRandomNumber()
        number.value=RandomNumber.getRandomNumber()
    }
}