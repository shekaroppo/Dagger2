package com.example.development.TwitterExample.component;


import com.example.development.TwitterExample.model.Tweeter;
import com.example.development.TwitterExample.module.NetworkModule;
import com.example.development.TwitterExample.module.TwitterModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Sekhar on 3/22/15.
 */

@Singleton
@Component(modules = {
        NetworkModule.class,
        TwitterModule.class,
})
public interface TwitterComponent {
    Tweeter provideTweeter();
}
