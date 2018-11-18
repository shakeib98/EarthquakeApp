package com.example.shakeib.earthquakeapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class CardRecyclerViewViewHolder(view:View) : RecyclerView.ViewHolder(view) {
    var magnitude = view.findViewById<TextView>(R.id.textMagnitude)
    var city = view.findViewById<TextView>(R.id.textCity)
    var date = view.findViewById<TextView>(R.id.textDate)
}