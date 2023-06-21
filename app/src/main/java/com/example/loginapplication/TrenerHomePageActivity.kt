package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import com.example.loginapplication.databinding.ActivitySignUpBinding
import com.example.loginapplication.databinding.ActivityTrenerHomePageBinding

class TrenerHomePageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTrenerHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrenerHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calendarView = binding.calendarView
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val selectedDate = "$dayOfMonth/${month + 1}/$year"
            Log.d("TrenerHomePageActivity", "Wybrana data: $selectedDate")

            val intent = Intent(this, TrenerListaActivity::class.java)
            intent.putExtra("selectedDate", selectedDate)
            startActivity(intent)
        }

        binding.textView42.setOnClickListener {
            val intent = Intent(this, AboutTrenerActivity::class.java)
            startActivity(intent)
        }

        binding.imageView25.setOnClickListener {
            val intent = Intent(this, AboutTrenerActivity::class.java)
            startActivity(intent)
        }

        binding.textView172.setOnClickListener {
            val intent = Intent(this, TrenerTreningiActivity::class.java)
            startActivity(intent)
        }

        binding.imageView27.setOnClickListener {
            val intent = Intent(this, TrenerTreningiActivity::class.java)
            startActivity(intent)
        }
    }
}