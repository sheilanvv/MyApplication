package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.content.Intent
import android.net.Uri
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvWelcomeMessage: TextView = findViewById(R.id.tv_welcome_message)
        val username = intent.getStringExtra("EXTRA_USERNAME")
        tvWelcomeMessage.text = "Selamat Datang, $username!"

        val btnWeb: Button = findViewById(R.id.btnWeb)
        btnWeb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://amikom.ac.id")
            startActivity(intent)
        }
    }
}