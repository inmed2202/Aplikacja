package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.databinding.ActivityAnalysisBinding

class AnalysisActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAnalysisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnalysisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.analysisbackBtn.setOnClickListener {
            val intent = Intent(this , CategoryActivity::class.java)
            startActivity(intent)
    }
}
}