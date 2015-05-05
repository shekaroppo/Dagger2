package com.example.development.TwitterExample;

import android.app.Activity;
import android.os.Bundle;


import com.example.development.dagger2.R;

import com.example.development.TwitterExample.component.DaggerTwitterComponent;
import com.example.development.TwitterExample.component.TwitterComponent;
import com.example.development.TwitterExample.module.TwitterModule;

public class TwitterApplication extends Activity {

    Tweeter tweeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TwitterComponent component = DaggerTwitterComponent.builder().twitterModule(new TwitterModule("Shekar====")).build();
        // VehicleComponent component = Dagger_VehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        tweeter = component.provideTweeter();
        tweeter.tweet("Imposible is nothing");

    }
}