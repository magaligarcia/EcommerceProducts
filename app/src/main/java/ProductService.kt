package com.example.mtapi3

import retrofit2.Call
import retrofit2.http.GET

interface ProductService {
    @GET("b/MX8A")
    fun getProducts(): Call<ProductResponse>
}