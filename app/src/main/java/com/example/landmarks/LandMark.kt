package com.example.landmarks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LandMark : AppCompatActivity() {
    lateinit var image: TextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AdapterLandMark
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_land_mark)
        recyclerView = findViewById(R.id.markRecyclerview)

        val bundle: Bundle? = intent.extras
        val positionX = bundle!!.getInt("position")

        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = AdapterLandMark(positionX)
        recyclerView.adapter = adapter


        adapter.setOnItemClickListener(object : RecyclerViewInterface {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@LandMark, Mark::class.java)
                intent.putExtra("position", position)
                startActivity(intent)
            }
        })
    }
}