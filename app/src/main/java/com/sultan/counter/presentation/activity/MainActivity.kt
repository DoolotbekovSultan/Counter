package com.sultan.counter.presentation.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.sultan.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.apply {

            viewModel.counter.observe(this@MainActivity) {
               counterTextView.text = it.counter.toString()
            }

            decrementButton.setOnClickListener {
                viewModel.decrement()
            }

            incrementButton.setOnClickListener {
                viewModel.increment()
            }
        }
    }
}