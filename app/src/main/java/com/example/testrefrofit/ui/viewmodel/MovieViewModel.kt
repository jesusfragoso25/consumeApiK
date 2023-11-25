package com.example.testrefrofit.ui.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.testrefrofit.data.model.Movie
import com.example.testrefrofit.data.repository.MovieRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieViewModel (aplication: Application): AndroidViewModel(aplication){
    val repository = MovieRepository()

    private val _movielist = MutableLiveData<List<Movie>>()
        val movieList: LiveData<List<Movie>>
            get() = _movielist

    fun getMovies(){
        repository.getMovies2().enqueue(object : Callback<List<Movie>> {
            override fun onResponse(call: Call<List<Movie>>, response: Response<List<Movie>>) {
                if (response.isSuccessful) {
                    _movielist.value = response.body()
                }
            }

            override fun onFailure(call: Call<List<Movie>>, t: Throwable) {

            }
        })
    }
}