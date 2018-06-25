package com.example.irhabi_ecsboard.sendbird.main;


import android.app.Application;

import com.sendbird.android.SendBird;

public class BaseApplication extends Application {

    private static final String APP_ID = "B83E667D-916E-4F90-8B42-F55C6EF2A25F"; // US-1 Demo
    public static final String VERSION = "3.0.39";

    @Override
    public void onCreate() {
        super.onCreate();
        SendBird.init(APP_ID, getApplicationContext());
    }
}
