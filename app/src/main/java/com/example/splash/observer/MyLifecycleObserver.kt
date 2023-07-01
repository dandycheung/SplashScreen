package com.example.splash.observer

import android.app.Activity
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyLifecycleObserver(private val activity: Activity) : DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        Log.d("Splash", "Activity:$activity Activity:$activity onCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.d("Splash", "Activity:$activity onStart")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.d("Splash", "Activity:$activity onResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d("Splash", "Activity:$activity onPause")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d("Splash", "Activity:$activity onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d("Splash", "Activity:$activity onDestroy")
    }
}
