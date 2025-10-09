package com.albin.examplemvvm.data

import com.albin.examplemvvm.data.database.dao.QuoteDao
import com.albin.examplemvvm.data.database.entities.QuoteEntity
import com.albin.examplemvvm.data.model.QuoteModel
import com.albin.examplemvvm.data.network.QuoteService
import com.albin.examplemvvm.domain.model.Quote
import com.albin.examplemvvm.domain.model.toDomain
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api:QuoteService ,
    private val quoteDao: QuoteDao
//    private val quoteProvider: QuoteProvider
) {

    //private val api = QuoteService()

    suspend fun getAllQuotesFromApi(): List<Quote>{
        val response: List<QuoteModel> = api.getQuotes()
       return  response.map{it.toDomain()}
    }
    suspend fun getAllQuotesFromDatabase():List<Quote>{
        val response: List<QuoteEntity> = quoteDao.getAllQuotes()
        return response.map { it.toDomain() }
    }

    suspend fun insertQuotes(quotes:List<QuoteEntity>){
        quoteDao.insertAll(quotes)
    }
    suspend fun clearQuotes(){
        quoteDao.deleteAllQuotes()
    }
}