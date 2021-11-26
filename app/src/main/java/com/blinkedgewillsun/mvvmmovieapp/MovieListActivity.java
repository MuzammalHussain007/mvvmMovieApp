package com.blinkedgewillsun.mvvmmovieapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Toast;

import com.blinkedgewillsun.mvvmmovieapp.MovieModal.MovieModalCLass;
import com.blinkedgewillsun.mvvmmovieapp.ViewModal.MovieListViewModal;

import java.util.List;

public class MovieListActivity extends AppCompatActivity {
    private MovieListViewModal movieListActivity ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innit();
        movieListActivity.getMovies().observe(this, new Observer<List<MovieModalCLass>>() {
            @Override
            public void onChanged(List<MovieModalCLass> movieModalCLasses) {
                Toast.makeText(MovieListActivity.this, ""+movieModalCLasses.get(0).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
        searchMovie("Fast",1);
    }

    private void innit() {
        movieListActivity = ViewModelProviders.of(this).get(MovieListViewModal.class);

    }
    private void searchMovie(String query,int pageno)
    {
        movieListActivity.searchMovie(query,pageno);
    }
}