package com.example.development.TwitterExample.module;

import javax.inject.Singleton;

import com.example.development.TwitterExample.Tweeter;
import com.example.development.TwitterExample.TwitterApi;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Sekhar on 3/22/15.
 */
@Module
public class TwitterModule {

    String userName;

    public TwitterModule(String userName) {
        this.userName = userName;
    }

    @Provides
    @Singleton
    Tweeter provideTweeter(TwitterApi api) {
        return new Tweeter(api, userName);
    }
}
