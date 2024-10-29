package com.example.rappi_u.ui.main

import model.Product
import retrofit2.Call
import retrofit2.http.GET

interface API {
    @GET("/api/producto")
    fun getProducto(): Call<List<Product>>
}