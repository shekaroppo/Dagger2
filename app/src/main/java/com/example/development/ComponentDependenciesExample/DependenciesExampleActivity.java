package com.example.development.ComponentDependenciesExample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.development.Base.BaseApplication;
import com.example.development.Base.BaseComponent;
import com.example.development.Base.NetworkUtils;
import com.example.development.R;

import javax.inject.Inject;

/**
 * Created by Shekar on 7/10/15.
 */
public class DependenciesExampleActivity extends Activity {

    @Inject
    String name;
    @Inject
    NetworkUtils mNetworkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseComponent component = BaseApplication.getComponent(this);
        DaggerDependenciesExampleComponent.builder()
                .dependenciesExampleModule(new DependenciesExampleModule())
                .baseComponent(component)
                .build().inject(this);
        if (mNetworkUtils.isNetworkAvailable()) {
            Log.d("Username:", name + "==");
        }

    }
}
