package com.example.development.SubComponentExample;

import com.example.development.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sekhar on 4/8/15.
 */
@Module
public class MobileModule {

    private String mPhoneNumber;

    public MobileModule(String phoneNumber) {
        this.mPhoneNumber = phoneNumber;
    }

    @Provides
    @ActivityScope
    public Mobile provideMobile(Sim sim) {
        return new Mobile(sim);
    }
}
