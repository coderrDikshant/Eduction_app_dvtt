package com.example.join

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        val secondpagebutton = findViewById<TextView>(R.id.button_second)
        secondpagebutton.setOnClickListener {
            val intent = Intent(this, TenthActivity::class.java)
            startActivity(intent)
        }

        val thirdActbutton = findViewById<TextView>(R.id.button_mechanics)
        thirdActbutton.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        val fourthActbutton = findViewById<TextView>(R.id.button_em)
        fourthActbutton.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
        val fifthActbutton = findViewById<TextView>(R.id.button_chemistry)
        fifthActbutton.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }
        val sixthActbutton = findViewById<TextView>(R.id.button_math)
        sixthActbutton.setOnClickListener {
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }
    }
}