package com.example.join

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class bss : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var recyclerViewMovieAdapter: RecyclerViewMovieAdapter? = null
    private var movieList = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bss)

        recyclerView = findViewById(R.id.rvMovieLists)
        recyclerViewMovieAdapter = RecyclerViewMovieAdapter(this@bss, movieList)
        recyclerView!!.layoutManager = GridLayoutManager(this, 2)
        recyclerView!!.adapter = recyclerViewMovieAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        prepareMovieListData()
    }

    private fun prepareMovieListData() {
        // Add different movie items here
        var movie = Movie("Movie A", R.drawable.shutterbugs)
        movieList.add(movie)
        movie = Movie("Movie B", R.drawable.frame)
        movieList.add(movie)
        movie = Movie("Movie C", R.drawable.designerds)
        movieList.add(movie)
        movie = Movie("Movie D", R.drawable.attelies)
        movieList.add(movie)
        movie = Movie("Movie E", R.drawable.raw)
        movieList.add(movie)
        movie = Movie("Movie F", R.drawable.dramebaaz)
        movieList.add(movie)
        movie = Movie("Movie G", R.drawable.tgt)
        movieList.add(movie)
        movie = Movie("Movie H", R.drawable.sangam)
        movieList.add(movie)
        movie = Movie("Movie A", R.drawable.shutterbugs)
        movieList.add(movie)
        movie = Movie("Movie B", R.drawable.frame)
        movieList.add(movie)
        movie = Movie("Movie C", R.drawable.designerds)
        movieList.add(movie)
        movie = Movie("Movie D", R.drawable.attelies)
        movieList.add(movie)
        movie = Movie("Movie E", R.drawable.raw)
        movieList.add(movie)
        movie = Movie("Movie F", R.drawable.dramebaaz)
        movieList.add(movie)
        movie = Movie("Movie G", R.drawable.tgt)
        movieList.add(movie)
        movie = Movie("Movie H", R.drawable.sangam)
        movieList.add(movie)

        recyclerViewMovieAdapter!!.notifyDataSetChanged()
    }
}
