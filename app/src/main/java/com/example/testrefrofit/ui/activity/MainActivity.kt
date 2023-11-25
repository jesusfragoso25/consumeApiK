package com.example.testrefrofit.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.testrefrofit.R
import com.example.testrefrofit.ui.viewmodel.MovieViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var movieViewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        movieViewModel = ViewModelProvider(this).get(MovieViewModel::class.java)

        movieViewModel.movieList.observe(this) {
            Log.d("Data", it.toString())
        }
        movieViewModel.getMovies()
    }
}