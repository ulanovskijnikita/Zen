package com.example.zen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter2(val con2: Context, val list2:List<dataClass2>): RecyclerView.Adapter<adapter2.Link2>() {
    class Link2(itemView: View): RecyclerView.ViewHolder(itemView) {
        val txt_id1: TextView =itemView.findViewById(R.id.recycler2TextView)
        val txt_id2: TextView =itemView.findViewById(R.id.recycler2TextView2)
        val im_id2: ImageView =itemView.findViewById(R.id.recycler2ImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter2.Link2 {
        val root2= LayoutInflater.from(con2).inflate(R.layout.recycler2, parent, false)
        return Link2(root2)
    }

    override fun onBindViewHolder(holder: adapter2.Link2, position: Int) {
        holder.txt_id1.setText(list2[position].Title)
        holder.txt_id2.setText(list2[position].Text1)
        holder.im_id2.setImageResource(list2[position].Img1)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}