package com.albin.examplemvvm.domain

import com.albin.examplemvvm.data.QuoteRepository
import com.albin.examplemvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository:QuoteRepository
) {

    //private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()

}