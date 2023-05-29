package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.databinding.ActivityLoyaltyBinding

class LoyaltyActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoyaltyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoyaltyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loyaltybackBtn.setOnClickListener {
            val intent = Intent(this , CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}