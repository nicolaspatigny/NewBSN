package com.example.newbsn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inscription1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription1)
        val button = findViewById<Button>(R.id.button_email_inscription)

        button.setOnClickListener {
            val intent = Intent(this, Inscription2::class.java)
            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.button_continuer_inscription_telepone)

        button1.setOnClickListener {
            val intent = Intent(this, Inscription3::class.java)
            startActivity(intent)
        }
    }
}
