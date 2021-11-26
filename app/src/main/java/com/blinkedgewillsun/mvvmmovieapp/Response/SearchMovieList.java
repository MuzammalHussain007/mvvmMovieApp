package com.blinkedgewillsun.mvvmmovieapp.Response;

import com.blinkedgewillsun.mvvmmovieapp.MovieModal.MovieModalCLass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchMovieList {
    @SerializedName("total_pages")
    @Expose()

    private int totalCount ;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @SerializedName("results")
    @Expose()

    private List<MovieModalCLass> movieModalCLass;

    @Override
    public String toString() {
        return "SearchMovieList{" +
                "totalCount=" + totalCount +
                ", movieModalCLass=" + movieModalCLass +
                '}';
    }

    public List<MovieModalCLass> getMovieModalCLass() {
        return movieModalCLass;
    }

    public void setMovieModalCLass(List<MovieModalCLass> movieModalCLass) {
        this.movieModalCLass = movieModalCLass;
    }
}

