package com.sultan.counter.data.mapper

import com.sultan.counter.data.model.CounterDto
import com.sultan.counter.domain.model.Counter
import com.sultan.counter.domain.model.TypeOfCounter

fun toTypeOfCounter(type: String): TypeOfCounter {
    return when (type) {
        "increment" ->  TypeOfCounter.INCREMENT
        "decrement" ->  TypeOfCounter.DECREMENT
        else ->  TypeOfCounter.NONE

    }
}
fun CounterDto.toCounter(): Counter {
    return Counter(
        counter = this.counter,
        typeOfCounter = when (this.type) {
            "increment" -> TypeOfCounter.INCREMENT
            "decrement" -> TypeOfCounter.DECREMENT
            else -> TypeOfCounter.NONE
        }
    )
}