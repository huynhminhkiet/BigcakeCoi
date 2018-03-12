package com.bigcake.viper

import com.dzaitsev.rxviper.ViewCallbacks

/**
 * Created by kiethuynh on 12/03/2018.
 */
interface MyView: ViewCallbacks {
  fun updateButtonLabel(label: String)
}