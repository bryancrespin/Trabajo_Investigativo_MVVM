package com.example.ejemplo_mvvm_dsm104.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ejemplo_mvvm_dsm104.model.QuoteModel
import com.example.ejemplo_mvvm_dsm104.model.QuoteProvider


class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()


    fun randomQuote(){
        val currentQuote = QuoteProvider.random()

        quoteModel.postValue(currentQuote)
    }


}