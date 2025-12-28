package com.example.fitnesscenter

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LowerBodyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        // Initialize ImageViews and set their onClickListeners to open the VideoPlayerActivity with corresponding data
        setupVideoThumbnail(R.id.video1, "raw/lowerbody.mp4", "Strengthens thighs and glutes\n" +
                "\n" +
                "Improves hip mobility\n" +
                "\n" +
                "Enhances balance\n" +
                "\n" +
                "Builds lower body power\n" +
                "\n" +
                "Supports knee health\n" +
                "\n" +
                "Burns calories")
        setupVideoThumbnail(R.id.video2, "raw/lowerbody2.mp4", "Tones legs and hips\n" +
                "\n" +
                "Improves balance and stability\n" +
                "\n" +
                "Increases leg flexibility\n" +
                "\n" +
                "Strengthens knee joints\n" +
                "\n" +
                "Enhances coordination\n" +
                "\n" +
                "Improves posture")
        setupVideoThumbnail(R.id.video3, "raw/lowerbody5.mp4", "Strengthens glute muscles\n" +
                "\n" +
                "Supports lower back\n" +
                "\n" +
                "Improves hip stability\n" +
                "\n" +
                "Enhances posture\n" +
                "\n" +
                "Reduces lower back pain\n" +
                "\n" +
                "Improves core strength")
        setupVideoThumbnail(R.id.video4, "raw/lowerbody3.mp4", "Strengthens calf muscles\n" +
                "\n" +
                "Improves ankle stability\n" +
                "\n" +
                "Enhances balance\n" +
                "\n" +
                "Supports walking and running\n" +
                "\n" +
                "Reduces leg fatigue\n" +
                "\n" +
                "Improves circulation")
        setupVideoThumbnail(R.id.video5, "raw/lowerbody4.mp4", "Strengthens legs and glutes\n" +
                "\n" +
                "Improves coordination\n" +
                "\n" +
                "Enhances balance\n" +
                "\n" +
                "Boosts leg endurance\n" +
                "\n" +
                "Burns calories\n" +
                "\n" +
                "Improves functional movement")
        setupVideoThumbnail(R.id.video6, "raw/lowerbody111.mp4", "Builds leg endurance\n" +
                "\n" +
                "Strengthens thighs\n" +
                "\n" +
                "Improves mental focus\n" +
                "\n" +
                "Enhances muscle control\n" +
                "\n" +
                "Supports knee strength\n" +
                "\n" +
                "Improves stamina")
        setupVideoThumbnail(R.id.video7, "raw/lowerbody88.mp4", "Strengthens lower abs and hips\n" +
                "\n" +
                "Improves leg flexibility\n" +
                "\n" +
                "Enhances core stability\n" +
                "\n" +
                "Supports hip joints\n" +
                "\n" +
                "Improves muscle tone\n" +
                "\n" +
                "Boosts endurance")
        setupVideoThumbnail(R.id.video8, "raw/lowerbody99.mp4", "Strengthens hip muscles\n" +
                "\n" +
                "Improves balance\n" +
                "\n" +
                "Enhances leg flexibility\n" +
                "\n" +
                "Tones outer thighs\n" +
                "\n" +
                "Supports hip stability\n" +
                "\n" +
                "Improves posture")
    }

    // Function to set up each video thumbnail with an onClick listener
    private fun setupVideoThumbnail(imageViewId: Int, videoUrl: String, description: String) {
        findViewById<ImageView>(imageViewId).setOnClickListener {
            openVideoPlayer(videoUrl, description)
        }
    }

    // Function to start the VideoPlayerActivity
    private fun openVideoPlayer(videoUrl: String, description: String) {
        val intent = Intent(this, VideoPlayerActivity::class.java)
        intent.putExtra("videoUrl", videoUrl)
        intent.putExtra("description", description)
        startActivity(intent)
    }
}
