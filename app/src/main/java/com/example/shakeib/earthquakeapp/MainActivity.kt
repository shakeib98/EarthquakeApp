package com.example.shakeib.earthquakeapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayList = ArrayList<Earthquake>()
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))
        arrayList.add(Earthquake(7.5,"Karachi","2018-02-12"))

        earthQuakeRv.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayout.VERTICAL,false)
        earthQuakeRv.adapter = CardRecyclerViewAdapter(R.layout.card_layout,arrayList)

    }
}
