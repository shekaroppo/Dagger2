package com.example.development.TwitterExample;

import android.util.Log;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Sekhar on 3/22/15.
 */

@Singleton
public class TwitterApi {
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient client;

    @Inject
    public TwitterApi(OkHttpClient client) {
        this.client = client;
    }

    public void postTweet(String name, String tweet) {
        Log.d("From: "+name,"Tweet: "+tweet+"");
//        RequestBody body = RequestBody.create(JSON, name + ":" + tweet);
//        Request request = new Request.Builder()
//                .url("http://image.tmdb.org/t/p/w500/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg")
//                .post(body)
//                .build();
//        try {
//            client.newCall(request).execute();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
