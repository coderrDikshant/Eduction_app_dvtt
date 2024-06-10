package com.example.join

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Acaccollege : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acaccollege)

        val bccaclick = findViewById<TextView>(R.id.heading2)
        bccaclick.setOnClickListener{
            val intent = Intent(this,bcca::class.java)
            startActivity(intent)
        }
    }
}