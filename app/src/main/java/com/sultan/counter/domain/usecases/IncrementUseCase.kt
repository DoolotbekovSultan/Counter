package com.sultan.counter.domain.usecases

import com.sultan.counter.domain.repository.CounterRepository

class IncrementUseCase(private val repository: CounterRepository) {
    operator fun invoke() {
        repository.increment()
    }
}