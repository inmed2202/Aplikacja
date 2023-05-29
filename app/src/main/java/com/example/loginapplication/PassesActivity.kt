package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.databinding.ActivityPassesBinding

class PassesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPassesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPassesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.passesbackBtn.setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}