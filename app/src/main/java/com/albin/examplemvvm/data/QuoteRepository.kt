package com.albin.examplemvvm.data

import com.albin.examplemvvm.data.model.QuoteModel
import com.albin.examplemvvm.data.model.QuoteProvider
import com.albin.examplemvvm.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api:QuoteService ,
    private val quoteProvider: QuoteProvider
) {

    //private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes=response
       return  response
    }
}