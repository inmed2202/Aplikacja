package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class CalendarFitnessCoachActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_fitness_coach)

        val floatingActionButton = findViewById<Button>(R.id.floatingActionButton)

        floatingActionButton.setOnClickListener {
            val intent = Intent(this, CreatingTheEventActivity::class.java)
            startActivity(intent)
        }
    }

}