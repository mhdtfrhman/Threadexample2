package com.example.threadexample2

import android.util.Log

class ExampleThread(private val seconds: Int) : Runnable {

    private companion object {
        private const val TAG = "ExampleThread"
    }

    override fun run() {
        for (i in 1..seconds) {
            Log.d(TAG, "startThread: $i")
            try {
                Thread.sleep(1000)
            } catch (ie: InterruptedException) {
                Log.e(TAG, "Thread interrupted", ie)
                Thread.currentThread().interrupt()
                break
            }
        }
    }
}