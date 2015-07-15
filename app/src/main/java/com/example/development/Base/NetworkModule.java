package com.example.development.Base;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shekar on 7/4/15.
 */

@Module
public class NetworkModule {

    @Provides
    @Singleton
    NetworkUtils getNetworkUtils() {
        return new NetworkUtils();
    }
}
