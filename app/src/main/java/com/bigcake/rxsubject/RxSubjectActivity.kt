package com.bigcake.rxsubject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bigcake.R
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.ReplaySubject
import kotlinx.android.synthetic.main.activity_rx_subject.btnClear
import kotlinx.android.synthetic.main.activity_rx_subject.btnComplete
import kotlinx.android.synthetic.main.activity_rx_subject.btnNext
import kotlinx.android.synthetic.main.activity_rx_subject.btnSubscribe
import kotlinx.android.synthetic.main.activity_rx_subject.tvMessage

class RxSubjectActivity : AppCompatActivity() {

  val subject = ReplaySubject.create<Int>()
  var value = 0
  var message = ""

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_rx_subject)

    setListeners()
  }

  private fun setListeners() {
    btnClear.setOnClickListener {
      message = ""
      tvMessage.text = ""
    }

    btnNext.setOnClickListener {
      subject.onNext(value++)
    }

    btnComplete.setOnClickListener {
      subject.onComplete()
    }

    btnSubscribe.setOnClickListener {
      btnSubscribe.visibility = View.GONE
      subject.subscribe({ v ->
        message += v.toString() + "\n"
        tvMessage.text = message
      }, {

      }, {
        message += "complete"
        tvMessage.text = message
      })
    }
  }
}
