package com.example.mvvmproject

import androidx.compose.runtime.mutableStateOf

class CounterRepository(
    private val counterModel: CounterModel
) {
    var counter = mutableStateOf(counterModel.counter)

    fun increment(){
        counter.value++
    }

    fun decrement(){
        counter.value--
    }
}