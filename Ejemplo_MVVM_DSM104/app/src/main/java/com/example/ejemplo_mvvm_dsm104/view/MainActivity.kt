package com.example.ejemplo_mvvm_dsm104.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.ejemplo_mvvm_dsm104.databinding.ActivityMainBinding
import com.example.ejemplo_mvvm_dsm104.model.QuoteModel
import com.example.ejemplo_mvvm_dsm104.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    private val quoteViewModel: QuoteViewModel by viewModels()






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->

            binding.tvQuote.text=currentQuote.quote
            binding.tvAuthor.text=currentQuote.author

        })

            binding.viewContainer.setOnClickListener{quoteViewModel.randomQuote()}
    }
}