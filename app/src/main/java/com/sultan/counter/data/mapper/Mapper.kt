package com.sultan.counter.data.mapper

import com.sultan.counter.data.model.CounterDto
import com.sultan.counter.domain.model.Counter
import com.sultan.counter.domain.model.TypeOfCounter

fun String.toTypeOfCounter(): TypeOfCounter {
    return when (this) {
        "increment" ->  TypeOfCounter.INCREMENT
        "decrement" ->  TypeOfCounter.DECREMENT
        else ->  TypeOfCounter.NONE

    }
}
fun CounterDto.toCounter(): Counter {
    return Counter(
        counter = counter,
        typeOfCounter = type.toTypeOfCounter()
    )
}