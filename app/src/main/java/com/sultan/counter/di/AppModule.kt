package com.sultan.counter.di

import com.sultan.counter.data.datasource.CounterDataSource
import com.sultan.counter.data.repository.CounterRepositoryImpl
import com.sultan.counter.domain.repository.CounterRepository
import com.sultan.counter.domain.usecases.DecrementUseCase
import com.sultan.counter.domain.usecases.GetCounterUseCase
import com.sultan.counter.domain.usecases.IncrementUseCase
import com.sultan.counter.presentation.activity.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    factory { CounterDataSource() }
    single<CounterRepository> { CounterRepositoryImpl(get()) }

    factory { IncrementUseCase(get()) }
    factory { DecrementUseCase(get()) }
    factory { GetCounterUseCase(get()) }

    viewModel {
        MainViewModel (
            incrementUseCase = get(),
            decrementUseCase = get(),
            getCounterUseCase = get()
        )
    }
}