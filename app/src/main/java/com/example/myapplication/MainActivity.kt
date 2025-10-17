package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d( "MainActivity","Aplikasi berhasil dijalankan!")

        val etUsername: EditText = findViewById(R.id.et_username)
        val btnLogin: Button = findViewById(R.id.btn_login)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val intent = Intent(this, HomeActivity::class.java)

            intent.putExtra("EXTRA_USERNAME", username)
            startActivity(intent)
        }
    }
}