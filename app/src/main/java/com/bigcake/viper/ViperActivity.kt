package com.bigcake.viper

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bigcake.R
import com.bigcake.fragment.FgActivity
import kotlinx.android.synthetic.main.activity_viper.btnClick
import kotlinx.android.synthetic.main.activity_viper.btnHome

class ViperActivity : AppCompatActivity(), MyRouter, MyView {

  lateinit var myPresenter: MyPresenter


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_viper)

    myPresenter = MyPresenter()

    btnClick.setOnClickListener {
      myPresenter.onButtonClick()
    }

    btnHome.setOnClickListener {
      myPresenter.onHomeBtnClick()
    }
  }

  override fun onStart() {
    super.onStart()
    myPresenter.takeRouter(this)
    myPresenter.takeView(this)
  }

  override fun onStop() {
    super.onStop()
    myPresenter.dropRouter(this)
    myPresenter.dropView(this)
  }

  override fun navigateToMain() {
    FgActivity.start(this)
  }

  override fun updateButtonLabel(label: String) {
    btnClick.text = label
  }


}
