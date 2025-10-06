package com.albin.examplemvvm.domain

import com.albin.examplemvvm.data.QuoteRepository
import com.albin.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()

}