package br.com.bernardo.currencyconvertey.service

import br.com.bernardo.currencyconvertey.model.Currency
import br.com.bernardo.currencyconvertey.model.Latest
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyAPI {

    @GET("latest")
    suspend fun getCurrencyData(
    @Query("apikey") apikey: String, @Query("currencies") currency: String, @Query("base_currency") baseCurrency: String
    ): Response<Currency>

    @GET("currencies")
    suspend fun getLatestCurrency(
        @Query("apikey") apikey: String, @Query("currencies") currencies: String
    ): Response<Latest>
}