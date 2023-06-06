package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.loginapplication.CategoryActivity
import com.example.loginapplication.R


class CalendarFitnessCoachActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_fitness_coach)

        val backBtn = findViewById<ImageButton>(R.id.categoryback_btn)

        backBtn.setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)

        }

        val floatingActionButton = findViewById<Button>(R.id.floatingActionButton)

        floatingActionButton.setOnClickListener {
            val intent = Intent(this, CreatingTheEventActivity::class.java)
            startActivity(intent)
        }
    }

}