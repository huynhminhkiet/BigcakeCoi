package com.bigcake.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.bigcake.BaseActivity
import com.bigcake.R

class FgActivity : BaseActivity() {

    companion object {
      fun start(context: Context) {
          val intent = Intent(context, FgActivity::class.java)
          context.startActivity(intent)
      }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fg)

        addRedFg()
    }

    private fun addRedFg() {
        val newFragment = RedFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, newFragment)
        transaction.commit()
    }
}
