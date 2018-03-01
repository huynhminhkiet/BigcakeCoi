package com.bigcake.fragment

import android.os.Bundle
import android.view.View
import com.bigcake.BaseFragment
import com.bigcake.R
import kotlinx.android.synthetic.main.fragment_green.*

/**
 * Created by kiethuynh on 28/02/2018
 */
class GreenFragment: BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_green
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        greenBtn.setOnClickListener {
            val newFragment = YellowFragment()
            val transaction = activity.supportFragmentManager.beginTransaction()

            transaction.add(R.id.fragmentContainer, newFragment)
            transaction.addToBackStack("t2")

            transaction.commit()
        }
    }
}