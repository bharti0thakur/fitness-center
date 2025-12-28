package com.example.fitnesscenter

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
 
class FreeStyleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)

        // Setup each video thumbnail with a unique video URL and description
        setupVideoThumbnail(R.id.video1, "raw/yoga11.mp4", "Improves body flexibility\n" +
                "\n" +
                "Strengthens muscles and joints\n" +
                "\n" +
                "Enhances blood circulation\n" +
                "\n" +
                "Boosts digestion and metabolism\n" +
                "\n" +
                "Helps in weight management\n" +
                "\n" +
                "Improves concentration and mental calmness\n" +
                "\n" +
                "Increases energy and overall fitness")
        setupVideoThumbnail(R.id.video2, "raw/yoga.mp4", "Reduces stress and anxiety\n" +
                "\n" +
                "Improves focus and concentration\n" +
                "\n" +
                "Calms the mind\n" +
                "\n" +
                "Enhances emotional balance\n" +
                "\n" +
                "Improves sleep quality\n" +
                "\n" +
                "Increases self-awareness\n" +
                "\n" +
                "Promotes mental peace")
        setupVideoThumbnail(R.id.video3, "raw/yoga2.mp4", "Improves body flexibility\n" +
                "\n" +
                "Increases muscle strength\n" +
                "\n" +
                "Enhances balance and posture\n" +
                "\n" +
                "Reduces stress and anxiety\n" +
                "\n" +
                "Improves breathing and lung capacity\n" +
                "\n" +
                "Boosts concentration and mental clarity\n" +
                "\n" +
                "Promotes overall physical and mental health")
        setupVideoThumbnail(R.id.video4, "raw/yoga33.mp4", "Strengthens legs and arms\n" +
                "\n" +
                "Improves body balance\n" +
                "\n" +
                "Enhances stamina\n" +
                "\n" +
                "Corrects posture\n" +
                "\n" +
                "Increases body awareness")
        setupVideoThumbnail(R.id.video5, "raw/yoga33.mp4", "Stretches back and hamstrings\n" +
                "\n" +
                "Improves digestion\n" +
                "\n" +
                "Relieves stress\n" +
                "\n" +
                "Calms the nervous system\n" +
                "\n" +
                "Reduces lower back stiffness")
        setupVideoThumbnail(R.id.video6, "raw/yoga44.mp4", "Strengthens spine\n" +
                "\n" +
                "Opens chest and lungs\n" +
                "\n" +
                "Improves posture\n" +
                "\n" +
                "Increases spinal flexibility\n" +
                "\n" +
                "Boosts energy levels")
        setupVideoThumbnail(R.id.video7, "raw/yoga55.mp4", "Improves spinal mobility\n" +
                "\n" +
                "Aids digestion\n" +
                "\n" +
                "Detoxifies internal organs\n" +
                "\n" +
                "Relieves back stiffness\n" +
                "\n" +
                "Enhances flexibility")
        setupVideoThumbnail(R.id.video8, "raw/yoga22.mp4", "Improves focus and concentration\n" +
                "\n" +
                "Strengthens core muscles\n" +
                "\n" +
                "Enhances coordination\n" +
                "\n" +
                "Improves stability\n" +
                "\n" +
                "Builds mental control")
    }

    // Binds an onClick event to the ImageView to launch the video player
    private fun setupVideoThumbnail(imageViewId: Int, videoUrl: String, description: String) {
        findViewById<ImageView>(imageViewId).setOnClickListener {
            openVideoPlayer(videoUrl, description)
        }
    }

    // Launches the VideoPlayerActivity with video data
    private fun openVideoPlayer(videoUrl: String, description: String) {
        val intent = Intent(this, VideoPlayerActivity::class.java)
        intent.putExtra("videoUrl", videoUrl)
        intent.putExtra("description", description)
        startActivity(intent)
    }
}
