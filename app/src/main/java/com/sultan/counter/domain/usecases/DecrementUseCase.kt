package com.sultan.counter.domain.usecases

import com.sultan.counter.domain.repository.CounterRepository

class DecrementUseCase(private val repository: CounterRepository) {
    operator fun invoke() {
        repository.decrement()
    }
}