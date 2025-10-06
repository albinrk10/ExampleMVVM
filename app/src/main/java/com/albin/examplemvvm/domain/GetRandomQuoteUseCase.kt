package com.albin.examplemvvm.domain

import com.albin.examplemvvm.data.QuoteRepository
import com.albin.examplemvvm.data.model.QuoteModel
import com.albin.examplemvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    private val respository = QuoteRepository()

    operator fun invoke(): QuoteModel? {
        val quotes = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}