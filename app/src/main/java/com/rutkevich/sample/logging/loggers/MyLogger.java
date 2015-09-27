package com.rutkevich.sample.logging.loggers;

import android.util.Log;

import com.rutkevich.sample.logging.BuildConfig;

public class MyLogger {

    public static final String TAG = "MyLogger";

    public static void d(String message) {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, message);
        }
    }

}
