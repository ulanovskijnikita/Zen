package com.example.zen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.zen.retrofit.model.DataQuotes

class adapter2(val con2: Context, val list2:List<DataQuotes>): RecyclerView.Adapter<adapter2.Link2>() {
    class Link2(itemView: View): RecyclerView.ViewHolder(itemView) {
        val txt_id1: TextView =itemView.findViewById(R.id.recycler2TextView)
        val txt_id2: TextView =itemView.findViewById(R.id.recycler2TextView2)
        val im_id2: ImageView =itemView.findViewById(R.id.recycler2ImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter2.Link2 {
        val root= LayoutInflater.from(con2).inflate(R.layout.recycler2, parent, false)
        return Link2(root)
    }

    override fun onBindViewHolder(holder: adapter2.Link2, position: Int) {
        holder.txt_id1.setText(list2[position].title)
        holder.txt_id2.setText(list2[position].description)
        Glide.with(con2).load(list2[position].image).into(holder.im_id2)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}