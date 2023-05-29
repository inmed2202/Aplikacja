package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.databinding.ActivityDieticianBinding

class DieticianActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDieticianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDieticianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dietbackBtn.setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}