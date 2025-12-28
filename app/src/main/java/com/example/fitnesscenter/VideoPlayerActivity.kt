package com.example.fitnesscenter

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideoPlayerActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var descriptionTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player)

        videoView = findViewById(R.id.videoView)
        descriptionTextView = findViewById(R.id.descriptionTextView)

        val videoUrl = intent.getStringExtra("videoUrl") // e.g., "raw/yoga11.mp4"
        val description = intent.getStringExtra("description")

        descriptionTextView.text = description ?: "No description available."

        videoUrl?.let {
            // Extract the filename from "raw/yoga11.mp4"
            val resourceName = it.substringAfter("raw/").substringBefore(".mp4")

            // Get resource ID
            val videoResId = resources.getIdentifier(resourceName, "raw", packageName)

            if (videoResId != 0) {
                val uri = Uri.parse("android.resource://$packageName/$videoResId")

                val mediaController = MediaController(this)
                mediaController.setAnchorView(videoView)

                videoView.setMediaController(mediaController)
                videoView.setVideoURI(uri)
                videoView.requestFocus()

                videoView.setOnPreparedListener {
                    videoView.start()
                }

            } else {
                descriptionTextView.text = "Error: Video resource '$resourceName' not found."
            }
        } ?: run {
            descriptionTextView.text = "Error: Video URL is missing."
        }
    }
}
