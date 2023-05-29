package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.databinding.ActivityYourDataBinding

class YourDataActivity : AppCompatActivity() {

    private lateinit var binding : ActivityYourDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYourDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.databack.setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}