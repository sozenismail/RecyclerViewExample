package com.ismailsozen.recyclerviewornek.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ismailsozen.recyclerviewornek.model.WriterModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.adapter_item_writer_list.view.*

class WriterListAdapter(val liste: List<WriterModel>) :
    RecyclerView.Adapter<WriterListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WriterListViewHolder {
        return WriterListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return liste.size
    }

    override fun onBindViewHolder(holder: WriterListViewHolder, position: Int) {

        holder.itemView.txtWriterName.text = liste[position].writerName
        holder.itemView.txtWriteTitle.text = liste[position].writeTitle
        holder.itemView.txtWriterEmail.text = liste[position].writerEmail






       Picasso.get()
                .load(liste[position].profilePhotoLink)
                .into(holder.itemView.imgProfilePhoto)


    }


}