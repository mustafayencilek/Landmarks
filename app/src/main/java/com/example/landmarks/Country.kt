package com.example.landmarks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Country : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var denemeList: ArrayList<String>
    private lateinit var adapter: AdapterCountry
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)
        recyclerView = findViewById(R.id.countryRecyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = AdapterCountry()
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : RecyclerViewInterface {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@Country, LandMark::class.java)
                intent.putExtra("position", position)
                startActivity(intent)
            }
        })

    }


}