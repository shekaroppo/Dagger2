package com.example.development.SubComponentExample;

import com.example.development.Base.NetworkUtils;
import com.example.development.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sekhar on 4/8/15.
 */
@Module
public class SimModule {

    @Provides
    @ActivityScope
    public Sim provideSim(NetworkUtils utils) {
        return new Sim(utils);
    }
}
