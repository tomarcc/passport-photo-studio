package com.madhabam.passportstudio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val btnTake = findViewById<Button>(R.id.btnTake)
        val btnGallery = findViewById<Button>(R.id.btnGallery)
        val btnEdit = findViewById<Button>(R.id.btnEdit)
        val btnSettings = findViewById<ImageButton>(R.id.btnSettings)

        btnTake.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        btnGallery.setOnClickListener {
            // TODO: open gallery picker
        }
        btnEdit.setOnClickListener {
            // TODO: open last-edited photo
        }
        btnSettings.setOnClickListener {
            // TODO: open settings
        }
    }
}
