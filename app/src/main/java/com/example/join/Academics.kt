package com.example.join

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Academics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_academics)
        val Actbutton = findViewById<TextView>(R.id.button_academics)
        Actbutton.setOnClickListener {
            val intent = Intent(this, TenthActivity::class.java)
            startActivity(intent)
        }
        val Acadbutton = findViewById<TextView>(R.id.button_college)
        Acadbutton.setOnClickListener {
            val intent = Intent(this, AboutCollege::class.java)
            startActivity(intent)
        }
    }
}