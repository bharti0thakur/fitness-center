package com.example.fitnesscenter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private val workoutDays = listOf(
        Day("yoga", "Lorem ipsum dolor", R.drawable.day1, true),
        Day("full body", "Dolor sit amet", R.drawable.day2, true),
        Day("upper body", "Lorem ipsum dolor", R.drawable.day3, true),
        Day("lower body", "Dolor sit amet", R.drawable.day4, false)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView = findViewById<RecyclerView>(R.id.dayRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = DayAdapter(workoutDays) { day ->
            when (day.title.lowercase()) {
                "upper body" -> startActivity(Intent(this, UpperBodyActivity::class.java))
                "lower body" -> startActivity(Intent(this, LowerBodyActivity::class.java))
                "full body" -> startActivity(Intent(this, FullBodyActivity::class.java))
                "yoga" -> startActivity(Intent(this, FreeStyleActivity::class.java))
                else -> Toast.makeText(this, "No activity found", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.startWorkoutBtn).setOnClickListener {
            Toast.makeText(this, "Starting workout...", Toast.LENGTH_SHORT).show()
        }
    }

    data class Day(
        val title: String,
        val subtitle: String,
        val imageRes: Int,
        val completed: Boolean
    )
}
