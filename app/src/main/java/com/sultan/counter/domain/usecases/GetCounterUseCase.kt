package com.sultan.counter.domain.usecases

import com.sultan.counter.domain.model.Counter
import com.sultan.counter.domain.repository.CounterRepository

class GetCounterUseCase(private val repository: CounterRepository) {
    operator fun invoke(): Counter {
        return repository.getCounter()
    }
}