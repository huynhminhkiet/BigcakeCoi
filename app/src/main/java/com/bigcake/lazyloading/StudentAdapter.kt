package com.bigcake.lazyloading

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bigcake.R

/**
 * Created by Administrator on 24/02/2018.
 */
class StudentAdapter(val context: Context, val loadMoreListener: (position: Int) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val students = mutableListOf<Student>()
    private var dataAvailable = true

    override fun getItemCount(): Int {
        return students.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val inflate = LayoutInflater.from(context)
        return StudentViewHolder(inflate.inflate(R.layout.item_student, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if (position >= itemCount - 1 && dataAvailable) {
            loadMoreListener(position)
        }

        (holder as StudentViewHolder).bindData(students[position])
    }

    fun refreshData(students: MutableList<Student>) {
        if (students.size == 0)
            dataAvailable = false
        else {
            this.students.addAll(students)
            notifyDataSetChanged()
        }
    }

}