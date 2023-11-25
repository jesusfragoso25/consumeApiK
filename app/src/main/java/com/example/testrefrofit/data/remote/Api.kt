package com.example.testrefrofit.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class Api {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://movie.danydev.co/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun geService():ApiService {
        return retrofit.create(ApiService::class.java)
    }
}