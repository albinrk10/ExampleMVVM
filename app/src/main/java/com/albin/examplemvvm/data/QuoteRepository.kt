package com.albin.examplemvvm.data

import com.albin.examplemvvm.data.model.QuoteModel
import com.albin.examplemvvm.data.model.QuoteProvider
import com.albin.examplemvvm.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes=response
       return  response
    }
}