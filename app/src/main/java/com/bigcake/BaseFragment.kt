package com.bigcake

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by kiethuynh on 28/02/2018
 */
abstract class BaseFragment: Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d("LOG " + javaClass.simpleName, "onAttach")

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("LOG " + javaClass.simpleName, "onCreateView")
        return inflater?.inflate(getLayoutId(), container, false)
    }

    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LOG " + javaClass.simpleName, "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("LOG " + javaClass.simpleName, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LOG " + javaClass.simpleName, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LOG " + javaClass.simpleName, "onDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("LOG " + javaClass.simpleName, "onDetach")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LOG " + javaClass.simpleName, "onDestroy")
    }
}