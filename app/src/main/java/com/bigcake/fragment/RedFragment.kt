package com.bigcake.fragment

import android.os.Bundle
import android.view.View
import com.bigcake.BaseFragment
import com.bigcake.R
import kotlinx.android.synthetic.main.fragment_red.*

/**
 * Created by kiethuynh on 28/02/2018
 */
class RedFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_red
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        redBtn.setOnClickListener {
            val newFragment = GreenFragment()
            val transaction = activity.supportFragmentManager.beginTransaction()

            transaction.replace(R.id.fragmentContainer, newFragment)
            transaction.addToBackStack("t1")

            transaction.commit()
        }
    }
}