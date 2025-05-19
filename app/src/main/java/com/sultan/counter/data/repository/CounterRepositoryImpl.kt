package com.sultan.counter.data.repository

import com.sultan.counter.data.datasource.CounterDataSource
import com.sultan.counter.data.mapper.toCounter
import com.sultan.counter.domain.model.Counter
import com.sultan.counter.domain.repository.CounterRepository

class CounterRepositoryImpl (
    private var api : CounterDataSource
) : CounterRepository {


    override fun increment() {
        api.increment()
    }

    override fun decrement() {
        api.decrement()
    }

    override fun getCounter(): Counter {
        val dto = api.getCounter()
        return dto.toCounter()
    }
}