package com.example.bsn_2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.bsn_2024.R

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)
        val button = findViewById<Button>(R.id.inscription)

        button.setOnClickListener {
            val intent = Intent(this, Inscription1::class.java)
            startActivity(intent)
        }
    }
}