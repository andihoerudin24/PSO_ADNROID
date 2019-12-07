package com.khilman.www.learngoogleapi.data.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    private static  Retrofit retrofit;
    public static Retrofit getUrl(){
         retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.3:8000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
          return  retrofit;
    }

}
