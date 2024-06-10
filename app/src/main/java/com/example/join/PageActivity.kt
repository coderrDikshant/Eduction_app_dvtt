package com.example.join

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)

        val secondActbutton = findViewById<TextView>(R.id.button_b)
        secondActbutton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        val computerActbutton = findViewById<TextView>(R.id.button_computer)
        computerActbutton.setOnClickListener {
            val intent = Intent(this, SeventhActivity::class.java)
            startActivity(intent)
        }
        val bioActbutton = findViewById<TextView>(R.id.button_bio)
        bioActbutton.setOnClickListener {
            val intent = Intent(this, EigthActivity::class.java)
            startActivity(intent)
        }
        val electricalActbutton = findViewById<TextView>(R.id.button_electrical)
        electricalActbutton.setOnClickListener {
            val intent = Intent(this, NinthActivity::class.java)
            startActivity(intent)
        }
        val mathActbutton = findViewById<TextView>(R.id.button_math)
        mathActbutton.setOnClickListener {
            val intent = Intent(this, FinalActivity::class.java)
            startActivity(intent)
        }
    }
}