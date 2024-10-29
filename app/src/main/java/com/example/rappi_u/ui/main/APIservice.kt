package com.example.rappi_u.ui.main
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object APIservice {
    private const val  BASE_URL ="http://localhost:8080"

    fun getInstace(): Retrofit{
        return Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}