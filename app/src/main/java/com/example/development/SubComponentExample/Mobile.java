package com.example.development.SubComponentExample;

import android.util.Log;

/**
 * Created by Shekar on 7/14/15.
 */
public class Mobile {
    private final Sim mSim;

    public Mobile(Sim sim) {
        mSim = sim;
    }

    public void makeCall() {
        if (mSim.isNetworkConnected()) {
            Log.d(":::::", "Making Call");
        } else {
            Log.d(":::::", "No Signal");
        }
    }
}
