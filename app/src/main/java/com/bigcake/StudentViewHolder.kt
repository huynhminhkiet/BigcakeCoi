package com.bigcake

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_student.view.*

/**
 * Created by Administrator on 24/02/2018.
 */
class StudentViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bindData(student: Student) {
        itemView.tvName.text = student.name
    }

}