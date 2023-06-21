package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.databinding.ActivityTrenerListaBinding
import com.example.loginapplication.databinding.ActivityTrenerLoginBinding

class TrenerListaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTrenerListaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrenerListaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button6.setOnClickListener {
            val intent = Intent(this, TrenerHomePageActivity::class.java)
            startActivity(intent)
        }
    }
}