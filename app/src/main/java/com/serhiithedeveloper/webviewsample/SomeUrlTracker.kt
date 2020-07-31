package com.serhiithedeveloper.webviewsample

import android.util.Log

const val TAG = "WebViewActivity"

interface SomeUrlTracker {
    fun trackUrl(url: String)
}

class SomeUrlTrackerImpl : SomeUrlTracker {
    override fun trackUrl(url: String) {
        Log.d(TAG, "Tracking url: $url")
    }
}
