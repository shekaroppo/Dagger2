package com.example.development.TwitterExample.module;

import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import com.example.development.TwitterExample.TwitterApi;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Sekhar on 3/22/15.
 */

@Module
public class
        NetworkModule {

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

    @Provides
    @Singleton
    TwitterApi provideTwitterApi(OkHttpClient client) {
        return new TwitterApi(client);
    }
}

