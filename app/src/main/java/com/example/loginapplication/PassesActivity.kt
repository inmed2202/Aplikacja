package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.TableLayout
import com.example.loginapplication.CategoryActivity
import com.example.loginapplication.PassInfoActivity
import com.example.loginapplication.R

class PassesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passes)

        val backBtn = findViewById<ImageButton>(R.id.categoryback_btn)

        backBtn.setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }

        val passLayout = findViewById<TableLayout>(R.id.pass)

        passLayout.setOnClickListener {
            val intent = Intent(this, PassInfoActivity::class.java)
            startActivity(intent)
        }
    }
}