package com.example.fitnesscenter

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FullBodyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        // Set up each video thumbnail with corresponding video URL and description
        setupVideoThumbnail(R.id.video1, "raw/fullbody99.mp4", "Strengthens back and legs\n" +
                "\n" +
                "Improves posture\n" +
                "\n" +
                "Builds core strength\n" +
                "\n" +
                "Enhances lifting power\n" +
                "\n" +
                "Increases muscle mass\n" +
                "\n" +
                "Reduces injury risk")
        setupVideoThumbnail(R.id.video2, "raw/fullbody55.mp4", "Strengthens core muscles\n" +
                "\n" +
                "Improves shoulder stability\n" +
                "\n" +
                "Enhances balance\n" +
                "\n" +
                "Boosts full body control\n" +
                "\n" +
                "Improves posture\n" +
                "\n" +
                "Increases endurance")
        setupVideoThumbnail(R.id.video3, "raw/fullbody3.mp4", "Full body muscle activation\n" +
                "\n" +
                "Improves strength and mobility\n" +
                "\n" +
                "Burns calories efficiently\n" +
                "\n" +
                "Enhances coordination\n" +
                "\n" +
                "Builds endurance\n" +
                "\n" +
                "Improves functional fitness")
        setupVideoThumbnail(R.id.video4, "raw/fullbody6.mp4", "Improves blood circulation\n" +
                "\n" +
                "Enhances cardiovascular fitness\n" +
                "\n" +
                "Strengthens legs and arms\n" +
                "\n" +
                "Burns calories\n" +
                "\n" +
                "Warms up the body\n" +
                "\n" +
                "Improves coordination")
        setupVideoThumbnail(R.id.video5, "raw/fullbody88.mp4", "Engages full body muscles\n" +
                "\n" +
                "Improves heart health\n" +
                "\n" +
                "Strengthens core\n" +
                "\n" +
                "Enhances agility\n" +
                "\n" +
                "Burns fat\n" +
                "\n" +
                "Boosts stamina")
        setupVideoThumbnail(R.id.video6, "raw/fullbody22.mp4", "Engages full body muscles\n" +
                "\n" +
                "Improves heart health\n" +
                "\n" +
                "Strengthens core\n" +
                "\n" +
                "Enhances agility\n" +
                "\n" +
                "Burns fat\n" +
                "\n" +
                "Boosts stamina")
        setupVideoThumbnail(R.id.video7, "raw/fullbody2.mp4", "Full body workout\n" +
                "\n" +
                "Boosts cardiovascular fitness\n" +
                "\n" +
                "Burns high calories\n" +
                "\n" +
                "Improves strength and endurance\n" +
                "\n" +
                "Enhances coordination\n" +
                "\n" +
                "Increases stamina")
        setupVideoThumbnail(R.id.video8, "raw/fullbody77.mp4", "Strengthens legs and glutes\n" +
                "\n" +
                "Improves core stability\n" +
                "\n" +
                "Enhances balance\n" +
                "\n" +
                "Boosts lower body power\n" +
                "\n" +
                "Burns calories\n" +
                "\n" +
                "Improves mobility")
    }

    // Helper method to bind click events to video thumbnails
    private fun setupVideoThumbnail(imageViewId: Int, videoUrl: String, description: String) {
        findViewById<ImageView>(imageViewId).setOnClickListener {
            openVideoPlayer(videoUrl, description)
        }
    }

    // Launch the video player activity with video URL and description
    private fun openVideoPlayer(videoUrl: String, description: String) {
        val intent = Intent(this, VideoPlayerActivity::class.java)
        intent.putExtra("videoUrl", videoUrl)
        intent.putExtra("description", description)
        startActivity(intent)
    }
}
