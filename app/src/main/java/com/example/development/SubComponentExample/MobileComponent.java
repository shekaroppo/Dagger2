package com.example.development.SubComponentExample;


import com.example.development.scope.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by Shekar on 7/1/15.
 */

@ActivityScope
@Subcomponent(
        modules = {
                SimModule.class,
                MobileModule.class
        })
public interface MobileComponent {
    void inject(MakeACallActivity makeACallActivity);
}
