package com.khilman.www.learngoogleapi.data.retrofit;

import com.khilman.www.learngoogleapi.data.model.Rute;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterfaces {

    @GET("pso/{id}")
    Call<Rute> getRute(@Path("id") int id);



}

