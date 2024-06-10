package com.example.join

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class generic3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic3)

        val heading = intent.getStringExtra("mainheading")
        val image = intent.getIntExtra("mainimage", 0)
        val role = intent.getStringExtra("role")
        val secyname = intent.getStringExtra("secyname")
        val secyimage = intent.getIntExtra("secyimg", 0)
        val joinsecyname1 = intent.getStringExtra("capname")
        val joinsecyimage1 = intent.getIntExtra("capimg", 0)
        val joinsecyname2 = intent.getStringExtra("vcapname")
        val joinsecyimage2 = intent.getIntExtra("vcapimg", 0)
        val joinsecyname3 = intent.getStringExtra("capname2")
        val joinsecyimage3 = intent.getIntExtra("capimg2", 0)
        val joinsecyname4 = intent.getStringExtra("vcapname2")
        val joinsecyimage4 = intent.getIntExtra("vcapimg2", 0)

        val headingTextView: TextView = findViewById(R.id.mainHeading)
        val roleofclub: TextView = findViewById(R.id.role)
        val imageView: ImageView = findViewById(R.id.mainlogo)
        val secy: TextView = findViewById(R.id.secyname)
        val secyImg: ImageView = findViewById(R.id.secyimg)
        val mc: TextView = findViewById(R.id.mencaptain)
        val mcImg: ImageView = findViewById(R.id.mencaptainimg)
        val mvc: TextView = findViewById(R.id.menvicecaptain)
        val mvcImg: ImageView = findViewById(R.id.menvicecaptainimg)
        val wc: TextView = findViewById(R.id.womencaptain)
        val wcImg: ImageView = findViewById(R.id.womencaptainimg)
        val wvc: TextView = findViewById(R.id.womenvicecaptai)
        val wvcImg: ImageView = findViewById(R.id.womenvicecaptainimg)

        headingTextView.text = heading
        roleofclub.text = role
        imageView.setImageResource(image)
        secy.text = secyname
        secyImg.setImageResource(secyimage)
        mc.text = joinsecyname1
        mcImg.setImageResource(joinsecyimage1)
        mvc.text = joinsecyname2
        mvcImg.setImageResource(joinsecyimage2)
        wc.text = joinsecyname3
        wcImg.setImageResource(joinsecyimage3)
        wvc.text = joinsecyname4
        wvcImg.setImageResource(joinsecyimage4)
    }
}
