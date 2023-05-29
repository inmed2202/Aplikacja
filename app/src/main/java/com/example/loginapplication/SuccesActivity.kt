package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.databinding.ActivityCategoryBinding
import com.example.loginapplication.databinding.ActivitySuccesBinding

class SuccesActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySuccesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.succesbackBtn.setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}