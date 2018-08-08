package com.example.misti.androidretrofit2rxjava.Retrofit;

import com.example.misti.androidretrofit2rxjava.Model.Post;

import java.util.List;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {

    @GET("posts")
    Observable<List<Post>> getPost();
}
