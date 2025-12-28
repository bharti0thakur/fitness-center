package com.example.fitnesscenter

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class UpperBodyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        findViewById<ImageView>(R.id.video1).setOnClickListener {
            startActivity(Intent(this, VideoActivity1::class.java))
        }
        findViewById<ImageView>(R.id.video2).setOnClickListener {
            startActivity(Intent(this, VideoActivity2::class.java))
        }
        findViewById<ImageView>(R.id.video3).setOnClickListener {
            startActivity(Intent(this, VideoActivity3::class.java))
        }
        findViewById<ImageView>(R.id.video4).setOnClickListener {
            startActivity(Intent(this, VideoActivity4::class.java))
        }
        findViewById<ImageView>(R.id.video5).setOnClickListener {
            startActivity(Intent(this, VideoActivity5::class.java))
        }
        findViewById<ImageView>(R.id.video6).setOnClickListener {
            startActivity(Intent(this, VideoActivity6::class.java))
        }
        findViewById<ImageView>(R.id.video7).setOnClickListener {
            startActivity(Intent(this, VideoActivity7::class.java))
        }
        findViewById<ImageView>(R.id.video8).setOnClickListener {
            startActivity(Intent(this, VideoActivity8::class.java))
        }
    }
}
