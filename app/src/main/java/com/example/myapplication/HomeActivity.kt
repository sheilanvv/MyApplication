package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val dashboardFragment = DashboardFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, dashboardFragment)
            .commit()

        val btnWeb: Button = findViewById(R.id.btnWeb)
        btnWeb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.amikom.ac.id")
            startActivity(intent)
        }
    }
}
