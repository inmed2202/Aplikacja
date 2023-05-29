package com.example.loginapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.example.loginapplication.databinding.ActivityCategoryBinding
import com.example.loginapplication.databinding.ActivityProfileBinding
import com.google.android.material.navigation.NavigationView

class CategoryActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.passes.setOnClickListener {
            val intent = Intent(this , PassesActivity::class.java)
            startActivity(intent)
        }

        binding.categorybackBtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        binding.categorysuccesBtn.setOnClickListener {
            val intent = Intent(this, SuccesActivity::class.java)
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