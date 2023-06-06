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

        binding.panieMore1.setOnClickListener {
            val intent = Intent(this, TreningSilowyActivity:: class.java)
            startActivity(intent)
        }

        binding.panieMore2.setOnClickListener {
            val intent = Intent(this, TreningCardioActivity:: class.java)
            startActivity(intent)
        }

        binding.panieMore3.setOnClickListener {
            val intent = Intent(this, TreningObwodowyActivity:: class.java)
            startActivity(intent)
        }

        binding.panieMore4.setOnClickListener {
            val intent = Intent(this, TreningFunkcjonalnyActivity:: class.java)
            startActivity(intent)
        }

        binding.panyMore1.setOnClickListener {
            val intent = Intent(this, TreningSilowyActivity:: class.java)
            startActivity(intent)
        }

        binding.panyMore2.setOnClickListener {
            val intent = Intent(this, TreningCardioActivity:: class.java)
            startActivity(intent)
        }

        binding.panyMore3.setOnClickListener {
            val intent = Intent(this, TreningObwodowyActivity:: class.java)
            startActivity(intent)
        }

        binding.panyMore4.setOnClickListener {
            val intent = Intent(this, TreningFunkcjonalnyActivity:: class.java)
            startActivity(intent)
        }

        binding.inneMore1.setOnClickListener {
            val intent = Intent(this, BoksActivity:: class.java)
            startActivity(intent)
        }

        binding.inneMore2.setOnClickListener {
            val intent = Intent(this, CrossfitActivity:: class.java)
            startActivity(intent)
        }

        binding.inneMore3.setOnClickListener {
            val intent = Intent(this, JogaActivity:: class.java)
            startActivity(intent)
        }

        binding.inneMore4.setOnClickListener {
            val intent = Intent(this, StratchingActivity:: class.java)
            startActivity(intent)
        }

        binding.download1.setOnClickListener {
            val intent = Intent(this, ObwodowyOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.download2.setOnClickListener {
            val intent = Intent(this, CardioOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.download3.setOnClickListener {
            val intent = Intent(this, SilowyOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.download4.setOnClickListener {
            val intent = Intent(this, FunkcjonalnyOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.download5.setOnClickListener {
            val intent = Intent(this, StratchingOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.download6.setOnClickListener {
            val intent = Intent(this, JogaOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.download7.setOnClickListener {
            val intent = Intent(this, BoksOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.download8.setOnClickListener {
            val intent = Intent(this, CrossfitOnlineActivity::class.java)
            startActivity(intent)
        }
    }
}