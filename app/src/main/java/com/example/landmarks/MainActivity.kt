package com.example.landmarks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var intentExplore: Intent
    lateinit var intentAbout: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intentExplore = Intent(this, Country::class.java)
        intentAbout = Intent(this, AboutMe::class.java)

    }

    fun onclick_Option(view: View) {
        when (view.id) {
            R.id.exploreButtonId -> startActivity(intentExplore)
            R.id.aboutButtonId -> startActivity(intentAbout)

        }
    }


}