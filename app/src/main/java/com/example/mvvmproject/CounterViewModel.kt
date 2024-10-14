package com.example.mvvmproject

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {
    var timeLeft = mutableStateOf(0)
        private set

    fun startCountdown(seconds: Int) {
        timeLeft.value = seconds
        viewModelScope.launch(Dispatchers.IO) {
            while (timeLeft.value > 0) {
                delay(1000)
                timeLeft.value -= 1
            }



        }
    }


    fun resetCountdown() {
        timeLeft.value = 0
    }














}
