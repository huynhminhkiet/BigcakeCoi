package com.bigcake.viper

import com.dzaitsev.rxviper.ViperPresenter

/**
 * Created by kiethuynh on 12/03/2018.
 */
class MyPresenter: ViperPresenter<MyView, MyRouter>() {
  fun onButtonClick() {
    if (hasView())
      view.updateButtonLabel("Next")
  }

  fun onHomeBtnClick() {
    if (hasRouter())
      router.navigateToMain()
  }

}