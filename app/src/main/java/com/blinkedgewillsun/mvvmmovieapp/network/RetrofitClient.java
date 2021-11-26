package com.blinkedgewillsun.mvvmmovieapp.network;

import com.blinkedgewillsun.mvvmmovieapp.APICredentail.Credential;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient retrofitClient;
    private static Retrofit retrofit;

    private RetrofitClient() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        retrofit = new Retrofit.Builder()
                .baseUrl(Credential.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    public static synchronized RetrofitClient getInstance() {
        if (retrofitClient == null) {
            retrofitClient = new RetrofitClient();
        }
        return retrofitClient;
    }

    public APISERVICES getapi() {
        return retrofit.create(APISERVICES.class);
    }
}
