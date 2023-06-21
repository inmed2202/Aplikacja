package com.example.loginapplication

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.example.loginapplication.databinding.ActivityProfileBinding
import com.example.myapplication.PassesActivity
import com.google.android.material.navigation.NavigationView

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding : ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.categorymoreBtn.setOnClickListener {
            val intent = Intent(this , CategoryActivity::class.java)
            startActivity(intent)
        }

        binding.profilebackBtn.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }

        binding.yourPasses.setOnClickListener {
            val intent = Intent(this, PassesActivity::class.java)
            startActivity(intent)
        }

        binding.yourSuccess.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
        }

        binding.yourData.setOnClickListener {
            val intent = Intent(this, YourDataActivity::class.java)
            startActivity(intent)
        }


    }
}