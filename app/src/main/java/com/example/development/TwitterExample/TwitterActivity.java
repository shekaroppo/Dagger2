package com.example.development.TwitterExample;

import android.app.Activity;
import android.os.Bundle;

import com.example.development.R;
import com.example.development.TwitterExample.component.DaggerTwitterComponent;
import com.example.development.TwitterExample.component.TwitterComponent;
import com.example.development.TwitterExample.model.Tweeter;
import com.example.development.TwitterExample.module.TwitterModule;

public class TwitterActivity extends Activity {

    Tweeter tweeter;
    private TwitterComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        component = DaggerTwitterComponent.builder().twitterModule(new TwitterModule("Shekar")).build();
        tweeter = component.provideTweeter();
        tweeter.tweet("Imposible is nothing");
    }
}