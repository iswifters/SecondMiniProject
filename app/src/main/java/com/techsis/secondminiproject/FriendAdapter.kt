package com.techsis.secondminiproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FriendAdapter(val context: Context):
    RecyclerView.Adapter<FriendAdapter.ViewHolder>() {

    val myfriends = SampleData()
    val betafriends = myfriends.listOfFriends

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int
    ): ViewHolder {
        val itemView: View = LayoutInflater.from(context).inflate(R.layout.card_layout,parent, false
        )
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FriendAdapter.ViewHolder, position: Int) {
        val friends= betafriends[position]
        holder.image.setImageResource(friends.drawableResource)
        holder.name.text = friends.name
        holder.age.text = friends.age
    }



    override fun getItemCount(): Int {
        return betafriends.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.image)
        val name :TextView = itemView.findViewById(R.id.name)
        val age : TextView = itemView.findViewById(R.id.age)
    }
}