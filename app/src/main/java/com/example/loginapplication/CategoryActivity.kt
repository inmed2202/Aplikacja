package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.databinding.ActivityCategoryBinding
import com.example.myapplication.PassesActivity

class CategoryActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.passes.setOnClickListener {
            val intent = Intent(this, PassesActivity::class.java)
            startActivity(intent)
        }

        binding.categorybackBtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        binding.categorysuccesBtn.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
        }

        binding.categorytrenerBtn.setOnClickListener {
            val intent = Intent(this, TrenerActivity::class.java)
            startActivity(intent)
        }

        binding.categorydietBtn.setOnClickListener {
            val intent = Intent(this, DieticianActivity::class.java)
            startActivity(intent)
        }

        binding.categoryloyalBtn.setOnClickListener {
            val intent = Intent(this, LoyaltyActivity::class.java)
            startActivity(intent)
        }

        binding.categoryanalysisBtn.setOnClickListener {
            val intent = Intent(this, AnalysisActivity::class.java)
            startActivity(intent)
        }

        binding.categorydataBtn.setOnClickListener {
            val intent = Intent(this, YourDataActivity::class.java)
            startActivity(intent)
        }

    }
}
