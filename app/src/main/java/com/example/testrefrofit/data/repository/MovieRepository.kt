package com.example.testrefrofit.data.repository

import retrofit2.Call
import com.example.testrefrofit.data.model.Movie
import com.example.testrefrofit.data.remote.Api
import retrofit2.Callback

class MovieRepository {
    val Api = Api().geService()
    fun getMovies () = Api.getMovies()

    fun getMovies2 (): Call<List<Movie>>{
        return Api.getMovies()
    }
    fun getMovies3(callback: Callback<List<Movie>>){
        Api.getMovies().enqueue(callback)
    }
}