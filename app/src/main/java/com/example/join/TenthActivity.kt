package com.example.join

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TenthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenth)

        val secondpagebutton = findViewById<TextView>(R.id.button_b)
        secondpagebutton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        val thirdpagebutton = findViewById<TextView>(R.id.button_computer)
        thirdpagebutton.setOnClickListener {
            val intent = Intent(this, SeventhActivity::class.java)
            startActivity(intent)
        }
        val fourthpagebutton = findViewById<TextView>(R.id.button_bio)
        fourthpagebutton.setOnClickListener {
            val intent = Intent(this, NinthActivity::class.java)
            startActivity(intent)
        }
        val fifthpagebutton = findViewById<TextView>(R.id.button_electrical)
        fifthpagebutton.setOnClickListener {
            val intent = Intent(this, EigthActivity::class.java)
            startActivity(intent)
        }
        val sixthpagebutton = findViewById<TextView>(R.id.button_math)
        sixthpagebutton.setOnClickListener {
            val intent = Intent(this, FinalActivity::class.java)
            startActivity(intent)
        }
    }
}