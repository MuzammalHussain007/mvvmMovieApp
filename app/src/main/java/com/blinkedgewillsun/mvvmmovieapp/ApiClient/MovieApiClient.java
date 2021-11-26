package com.blinkedgewillsun.mvvmmovieapp.ApiClient;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.blinkedgewillsun.mvvmmovieapp.APICredentail.Credential;
import com.blinkedgewillsun.mvvmmovieapp.AppExecutor;
import com.blinkedgewillsun.mvvmmovieapp.MovieModal.MovieModalCLass;
import com.blinkedgewillsun.mvvmmovieapp.network.RetrofitClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Response;

public class MovieApiClient {
    private static MovieApiClient movieApiClient ;
    private MutableLiveData<List<MovieModalCLass>> mutableLiveData;
    private RetrieveMovesRunnable retrieveMovesRunnable;

    public static MovieApiClient getInstance()
    {
        if (movieApiClient==null)
        {
            movieApiClient = new MovieApiClient();
        }
        return movieApiClient;
    }

    private MovieApiClient()
    {
        mutableLiveData = new MutableLiveData<>();
     }

    public LiveData<List<MovieModalCLass>> getMovies()
    {
        return mutableLiveData;
    }

    public void searchMovie(String query ,int pageno)
    {
        if (retrieveMovesRunnable!=null)
        {
            retrieveMovesRunnable = null;
        }
        retrieveMovesRunnable = new RetrieveMovesRunnable(query,pageno);

        final Future myHandler = AppExecutor.getInstance().getNetworkIO().submit(retrieveMovesRunnable);

        AppExecutor.getInstance().getNetworkIO().schedule(new Runnable() {
            @Override
            public void run() {
             myHandler.cancel(true);
            }
        },300, TimeUnit.MILLISECONDS);
    }

    private class RetrieveMovesRunnable implements Runnable
    {
        private String query;
        private int page_count;
        private boolean cancelRequest;

        public RetrieveMovesRunnable(String query, int page_count) {
            this.query = query;
            this.page_count = page_count;
            cancelRequest = false;
        }

        @Override
        public void run() {

        }
    }
}
