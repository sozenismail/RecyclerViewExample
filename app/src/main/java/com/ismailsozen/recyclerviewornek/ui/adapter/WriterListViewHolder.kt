package com.ismailsozen.recyclerviewornek.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ismailsozen.recyclerviewornek.R

class WriterListViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.adapter_item_writer_list,
            parent,
            false
        )
    ) {


}