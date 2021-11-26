package com.blinkedgewillsun.mvvmmovieapp.ViewModal;

import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.blinkedgewillsun.mvvmmovieapp.MovieModal.MovieModalCLass;
import com.blinkedgewillsun.mvvmmovieapp.Respositry.MovieRespoitry;

import java.util.List;

public class MovieListViewModal extends ViewModel {
    public LiveData<List<MovieModalCLass>> getMovies()
    {
        return MovieRespoitry.getInstance().getMovies();
    }

    public void searchMovie(String query,int pageno)
    {
        Log.d("TAG", "searchMovie:");
        MovieRespoitry.getInstance().searchMovie(query,pageno);
    }


}
