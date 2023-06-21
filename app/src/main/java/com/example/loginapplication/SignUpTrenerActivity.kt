package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginapplication.databinding.ActivitySignUpTrenerBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpTrenerActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpTrenerBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpTrenerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()


        binding.loginBtnSutrener.setOnClickListener {
            val intent = Intent(this, TrenerLoginActivity::class.java)
            startActivity(intent)
        }

        binding.signupSutrener.setOnClickListener {
            val username = binding.nameBoxSutrener.text.toString()
            val email = binding.emailBoxSutrener.text.toString()
            val identify = binding.emailBox2Sutrener.text.toString()
            val password = binding.passwordBoxSutrener.text.toString()
            val confirm = binding.confirmBoxSutrener.text.toString()

            if (username.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && confirm.isNotEmpty() && identify == "tr865") {
                if (password == confirm) {

                    firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener {
                            if (it.isSuccessful) {
                                val intent = Intent(this, TrenerLoginActivity::class.java)
                                startActivity(intent)
                            } else {
                                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT)
                                    .show()

                            }
                        }
                } else {
                    Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Empty fields are not allowed!", Toast.LENGTH_SHORT).show()

            }


        }

        binding.backBtnSutrener.setOnClickListener {
            val intent = Intent(this, TrenerLoginActivity::class.java)
            startActivity(intent)
        }


        //initUI()
    }
}
