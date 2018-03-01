package com.bigcake.fragment

import android.os.Bundle
import com.bigcake.BaseActivity
import com.bigcake.R

class FgActivity : BaseActivity() {


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
