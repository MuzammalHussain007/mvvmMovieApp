package com.blinkedgewillsun.mvvmmovieapp.network;

import com.blinkedgewillsun.mvvmmovieapp.MovieModal.MovieModalCLass;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APISERVICES {
    @GET("/3/search/movie")
    Call<MovieModalCLass> searchMovie(
            @Query("api_key") String key,
            @Query("query") String query,
            @Query("page") int page
    );

    @GET("/3/movie/{movie_id}")
    Call<MovieModalCLass> getMovie(
            @Path("movie_id") int id,
            @Query("api_key") String key
    );




}
