package com.oxidiz3.onemind

import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    // Most of the code written for this project is in the xml files
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declare count variables
        var totalCount = 0.0f
        var thoughtsCount = 0.0f
        var taskCount = 0.0f
        var wanderingCount = 0.0f

        // Get references to the buttons
        val btnThoughtYes = findViewById<Button>(R.id.btn_thoughts_yes)
        val btnMindYes = findViewById<Button>(R.id.btn_mind_yes)
        val btnTaskYes = findViewById<Button>(R.id.btn_task_yes)
        val btnSubmit = findViewById<Button>(R.id.btn_submit_yes)

        // Set the button listeners to increment the count variables
        btnThoughtYes.setOnClickListener { thoughtsCount += 1 }
        btnTaskYes.setOnClickListener { taskCount += 1 }
        btnMindYes.setOnClickListener { wanderingCount += 1 }
        btnSubmit.setOnClickListener {
            totalCount += 1
            findViewById<ProgressBar>(R.id.goodThoughtsProgress).progress =
                (100 * thoughtsCount / totalCount).toInt()
            findViewById<ProgressBar>(R.id.onTaskProgress).progress =
                (100 * taskCount / totalCount).toInt()
            findViewById<ProgressBar>(R.id.wanderingMindProgress).progress =
                (100 * wanderingCount / totalCount).toInt()
        }
    }
}