package com.blinkedgewillsun.mvvmmovieapp.Response;

import com.blinkedgewillsun.mvvmmovieapp.MovieModal.MovieModalCLass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SingalMovieResponse {
    @SerializedName("results")
    @Expose
    private MovieModalCLass movieModalCLass;

    @Override
    public String toString() {
        return "SingalMovieResponse{" +
                "movieModalCLass=" + movieModalCLass +
                '}';
    }

    public MovieModalCLass getMovieModalCLass() {
        return movieModalCLass;
    }

    public void setMovieModalCLass(MovieModalCLass movieModalCLass) {
        this.movieModalCLass = movieModalCLass;
    }
}
