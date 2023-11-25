package com.example.testrefrofit.data.remote

import com.example.testrefrofit.data.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("movie")
    fun getMovies(): Call<List<Movie>>
}