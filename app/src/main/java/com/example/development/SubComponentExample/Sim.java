package com.example.development.SubComponentExample;

import com.example.development.Base.NetworkUtils;

public class Sim {

    private final NetworkUtils mNetworkUtils;

    public Sim(NetworkUtils utils) {
        mNetworkUtils = utils;
    }

    public boolean isNetworkConnected() {
        return mNetworkUtils.isNetworkAvailable();
    }
}

