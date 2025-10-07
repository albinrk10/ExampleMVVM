package com.albin.examplemvvm.domain
import com.albin.examplemvvm.data.model.QuoteModel
import com.albin.examplemvvm.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
 private val quoteProvider: QuoteProvider
) {
   // private val repository = QuoteRepository()

    operator fun invoke(): QuoteModel? {
        val quotes = quoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}