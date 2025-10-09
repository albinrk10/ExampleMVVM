package com.albin.examplemvvm.domain
import com.albin.examplemvvm.data.QuoteRepository
import com.albin.examplemvvm.data.model.QuoteModel
import com.albin.examplemvvm.domain.model.Quote
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
 private val repository: QuoteRepository
) {
   // private val repository = QuoteRepository()

  suspend  operator fun invoke(): Quote? {
        val quotes = repository.getAllQuotesFromDatabase()
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}