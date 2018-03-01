package com.bigcake.fragment

import android.os.Bundle
import android.view.View
import com.bigcake.BaseFragment
import com.bigcake.R
import kotlinx.android.synthetic.main.fragment_yellow.*

/**
 * Created by kiethuynh on 28/02/2018
 */
class YellowFragment: BaseFragment() {
    override fun getLayoutId(): Int {
       return R.layout.fragment_yellow
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        popBtn.setOnClickListener {
            val fm = activity
                    .supportFragmentManager
            fm.popBackStackImmediate()
        }
    }
}