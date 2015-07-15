package com.example.development.Base;

import android.app.Application;
import android.content.Context;


public class BaseApplication extends Application {

    private BaseComponent component;

    public static BaseComponent getComponent(Context context) {
        return ((BaseApplication) context.getApplicationContext()).component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerBaseComponent.builder().baseModule(new BaseModule(this)).build();
    }
}

