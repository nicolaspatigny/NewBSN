package com.example.newbsn

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inscription2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription2)
        val button = findViewById<Button>(R.id.telephone)

        button.setOnClickListener {
            val intent = Intent(this, Inscription1::class.java)
            startActivity(intent)
        }

        val button1 = findViewById<Button>(R.id.button_continuer_inscription_telepone)

        button1.setOnClickListener {
            val intent = Intent(this, Inscription3::class.java)
            startActivity(intent)
        }
    }
}