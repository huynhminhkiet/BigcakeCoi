package com.bigcake

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by kiethuynh on 28/02/2018
 */

open class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LOG " + javaClass.simpleName, "onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LOG " + javaClass.simpleName, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LOG " + javaClass.simpleName, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LOG " + javaClass.simpleName, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LOG " + javaClass.simpleName, "onDestroy")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("LOG " + javaClass.simpleName, "onRestoreInstanceState")

    }
}