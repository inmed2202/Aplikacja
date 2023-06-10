package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.cardview.widget.CardView

class DietPlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_plan)

        val todaysPlan = findViewById<CardView>(R.id.todaysPlan)

        todaysPlan.setOnClickListener{
            val intent = Intent(this, TodaysDPActivity::class.java)
            startActivity(intent)
        }

        val tommorrowsPlan = findViewById<CardView>(R.id.tommorrowsPlan)

        tommorrowsPlan.setOnClickListener{
            val intent = Intent(this, TommorrowsDPActivity::class.java)
            startActivity(intent)
        }
    }
}