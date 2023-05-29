package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.databinding.ActivityTrenerBinding

class TrenerActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTrenerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrenerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trenerbackBtn.setOnClickListener {
            val intent = Intent(this , CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}