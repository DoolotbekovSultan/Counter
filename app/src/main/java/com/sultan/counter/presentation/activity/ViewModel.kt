package com.sultan.counter.presentation.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sultan.counter.domain.model.Counter
import com.sultan.counter.domain.usecases.DecrementUseCase
import com.sultan.counter.domain.usecases.GetCounterUseCase
import com.sultan.counter.domain.usecases.IncrementUseCase

class MainViewModel(
    private val incrementUseCase : IncrementUseCase,
    private val decrementUseCase : DecrementUseCase,
    private val getCounterUseCase: GetCounterUseCase
) : ViewModel() {

    private val _counter = MutableLiveData<Counter>()
    val counter : LiveData<Counter> = _counter

    fun increment() {
        incrementUseCase()
        _counter.value = getCounterUseCase()
    }
    fun decrement() {
        decrementUseCase()
        _counter.value = getCounterUseCase()
    }
}