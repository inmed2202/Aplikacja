package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginapplication.databinding.ActivityTrenerLoginBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth

class TrenerLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTrenerLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrenerLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signinBtnTrener.setOnClickListener {
            val intent = Intent(this, TrenerHomePageActivity::class.java)
            startActivity(intent)
        }


        binding.signupTrener.setOnClickListener {
            val intent = Intent(this, SignUpTrenerActivity::class.java)
            startActivity(intent)
        }

        binding.backBtnTrener.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.klientTrener.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}