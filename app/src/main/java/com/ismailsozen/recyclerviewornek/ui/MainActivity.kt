package com.ismailsozen.recyclerviewornek.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ismailsozen.recyclerviewornek.R
import com.ismailsozen.recyclerviewornek.mock.MockList
import com.ismailsozen.recyclerviewornek.ui.adapter.WriterListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycWriterList.adapter=WriterListAdapter(MockList.getMockedWriterList())
        recycWriterList.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


    }
}
