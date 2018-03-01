package com.bigcake.lazyloading

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.bigcake.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: StudentAdapter
    val dataSource = DataSource()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        rvStudent.layoutManager = LinearLayoutManager(this)

        adapter = StudentAdapter(this, { position ->
            loadMore(position)
        })
        rvStudent.adapter = adapter

        adapter.refreshData(dataSource.getData(0))
    }

    private fun loadMore(position: Int) {
        rvStudent.post {
            adapter.refreshData(dataSource.getData(position + 1))
        }

    }
}
