package com.sultan.counter.domain.repository

import com.sultan.counter.domain.model.Counter

interface CounterRepository {
    fun increment()
    fun decrement()
    fun getCounter() : Counter
}