package com.example.fitnesscenter

import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideoActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)

        val videoUri = Uri.parse("android.resource://${packageName}/${R.raw.upperbody22}")
        videoView.setVideoURI(videoUri)
        videoView.start()

        descriptionText.text = getString(R.string.upperbody1_description)
    }
}
