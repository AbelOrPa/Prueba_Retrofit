package com.example.retrofitdemo2.Interface;

import com.example.retrofitdemo2.Model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("posts") //añadir donde se encuentra la info .../XXX

    Call<List<Posts>> getPosts();
}
