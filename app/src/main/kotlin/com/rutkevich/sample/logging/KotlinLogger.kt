package com.rutkevich.sample.logging

import android.util.Log

inline fun logD(messageLambda: () -> String) {
    if (BuildConfig.DEBUG) {
        Log.d("TAG", messageLambda())
    }
}
