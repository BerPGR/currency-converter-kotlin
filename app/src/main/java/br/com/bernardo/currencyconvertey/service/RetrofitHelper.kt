package br.com.bernardo.currencyconvertey.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {
    companion object {
        val baseUrl = "https://api.freecurrencyapi.com/v1/"

        val retrofit = Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

//https://api.freecurrencyapi.com/v1/currencies?apikey=fca_live_fVXFpFI7HTppbByEaiV85sfuKTXT9fMfw6mcTWUn&currencies=BRL