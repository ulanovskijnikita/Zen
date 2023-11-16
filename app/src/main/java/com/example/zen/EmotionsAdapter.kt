package com.example.zen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cinema.retrofit.model.DataEmotion


////  Для data class'а
//class EmotionsAdapter(val con:Context, val list:List<dataClass>):RecyclerView.Adapter<EmotionsAdapter.Link>() {

//  Для Retrofit'а
class EmotionsAdapter(val con: Context, val list: List<DataEmotion>): RecyclerView.Adapter<EmotionsAdapter.Link>() {
    class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
        val id: TextView = itemView.findViewById(R.id.recycler1TextView1)
        val im_id: ImageView = itemView.findViewById(R.id.recycler1ImageView)
        val txt_id: TextView = itemView.findViewById(R.id.recycler1TextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmotionsAdapter.Link {
        val root= LayoutInflater.from(con).inflate(R.layout.recycler1, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: EmotionsAdapter.Link, position: Int) {
//        //  Для data class'а
//        holder.im_id.setImageResource(list[position].Img)
//        holder.txt_id.setText(list[position].Text)

        //  Для Retrofit'а
        holder.id.setText(list[position].id)
        holder.txt_id.setText(list[position].title)
        Glide.with(con).load(list[position].image).into(holder.im_id)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}