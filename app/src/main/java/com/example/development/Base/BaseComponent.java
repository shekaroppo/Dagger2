package com.example.development.Base;

import com.example.development.SubComponentExample.MobileComponent;
import com.example.development.SubComponentExample.MobileModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Shekar on 7/3/15.
 */

@Singleton
@Component(modules = {
        BaseModule.class,
        NetworkModule.class
})
public interface BaseComponent {
    /**
     * This is the way how we can add subcomponent in main component.
     * MobileComponent is added to BaseComponent in MakeACallActivity
     */
    MobileComponent plus(MobileModule mobileModule);

    /**
     * Opening this api for DependenciesExampleActivity
     */
    NetworkUtils getNetworkUtils();
}
