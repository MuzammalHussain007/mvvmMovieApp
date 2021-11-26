package com.blinkedgewillsun.mvvmmovieapp.Respositry;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.blinkedgewillsun.mvvmmovieapp.ApiClient.MovieApiClient;
import com.blinkedgewillsun.mvvmmovieapp.MovieModal.MovieModalCLass;

import java.util.List;

public class MovieRespoitry {
     private static MovieRespoitry movieRespoitry ;
     private MovieApiClient movieApiClient ;


    public static MovieRespoitry getInstance()
    {
        if (movieRespoitry==null)
        {
            movieRespoitry= new MovieRespoitry();
        }
        return movieRespoitry;
    }

    private MovieRespoitry()
    {
        movieApiClient = MovieApiClient.getInstance();
    }

    public LiveData<List<MovieModalCLass>> getMovies()
    {
        return movieApiClient.getMovies();
    }

    public void searchMovie(String query , int pageno)
    {
        movieApiClient.searchMovie(query,pageno);
    }
}
