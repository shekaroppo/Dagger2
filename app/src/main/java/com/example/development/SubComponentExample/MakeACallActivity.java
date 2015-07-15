package com.example.development.SubComponentExample;

import android.app.Activity;
import android.os.Bundle;

import com.example.development.Base.BaseApplication;
import com.example.development.R;

import javax.inject.Inject;

import butterknife.ButterKnife;


/**
 * Created by Sekhar on 4/6/15.
 */
public class MakeACallActivity extends Activity {

    @Inject
    Sim mSim;

    @Inject
    Mobile mMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        BaseApplication.getComponent(this).plus(new MobileModule("9951814725")).inject(this);
        mMobile.makeCall();
    }
}
