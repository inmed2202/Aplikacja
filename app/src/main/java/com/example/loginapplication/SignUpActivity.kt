package com.example.loginapplication

import android.content.ContentProviderClient
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginapplication.databinding.ActivityMainBinding
import com.example.loginapplication.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.loginBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.signup.setOnClickListener {
            val email = binding.emailBox.text.toString()
            val password = binding.passwordBox.text.toString()
            val confirm = binding.confirmBox.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && confirm.isNotEmpty()){
                if (password == confirm){

                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{
                        if(it.isSuccessful){
                            val intent = Intent( this , MainActivity::class.java )
                            startActivity(intent)
                        }else{
                            Toast.makeText(this , it.exception.toString() , Toast.LENGTH_SHORT).show()

                        }
                    }
                }else{
                    Toast.makeText(this , "Password is not matching", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this , "Empty fields are not allowed!", Toast.LENGTH_SHORT).show()

            }


        }

        binding.backBtn.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

        //initUI()
    }

   /* private fun initUI() {
        binding.backBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }*/
}