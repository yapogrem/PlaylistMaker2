package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayFind = findViewById<Button>(R.id.find)
        displayFind.setOnClickListener {
            val displayIntent = Intent(this, Find::class.java)
            startActivity(displayIntent)
        }

        val displayMedia = findViewById<Button>(R.id.media)
        displayMedia.setOnClickListener {
            val displayIntent = Intent(this, Media::class.java)
            startActivity(displayIntent)
        }

        val displaySettings = findViewById<Button>(R.id.settings)
        displaySettings.setOnClickListener {
            val displayIntent = Intent(this, Settings::class.java)
            startActivity(displayIntent)
        }
    }
}