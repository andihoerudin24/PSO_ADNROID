package com.khilman.www.learngoogleapi.data.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    private static  Retrofit retrofit;
    public static Retrofit getUrl(){
         retrofit = new Retrofit.Builder()
                .baseUrl("https://hoerudinumkm.000webhostapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
          return  retrofit;
    }

}
