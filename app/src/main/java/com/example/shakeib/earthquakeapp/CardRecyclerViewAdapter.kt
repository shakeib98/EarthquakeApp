package com.example.shakeib.earthquakeapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class CardRecyclerViewAdapter(var viewItem:Int, var data:ArrayList<Earthquake>) : RecyclerView.Adapter<CardRecyclerViewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, itemType: Int): CardRecyclerViewViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(viewItem,parent,false)
        return CardRecyclerViewViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CardRecyclerViewViewHolder, position: Int) {
        holder.magnitude.text = data[position].mag.toString()
        holder.city.text = data[position].city
        holder.date.text= data[position].date
    }

}