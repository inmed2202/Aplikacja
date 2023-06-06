package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.databinding.ActivityCategoryBinding
import com.example.loginapplication.databinding.ActivityTrenningsBinding

class TrenningsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTrenningsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrenningsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.download1.setOnClickListener {
            val intent = Intent(this, ObwodowyOnlineActivity::class.java)
            startActivity(intent)
        }
    }
}