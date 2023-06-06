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
import com.google.android.material.navigation.NavigationView

class ProfileActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle
    private lateinit var binding : ActivityProfileBinding

    companion object {
        private const val REQUEST_IMAGE_CAPTURE = 1
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_profile)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)



        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    Toast.makeText(applicationContext, "Clicked Home", Toast.LENGTH_SHORT)
                        .show()
                }

                R.id.nav_training -> {
                    val intent_trennings = Intent(this , TrenningsActivity::class.java)
                    startActivity(intent_trennings)

                    /*Toast.makeText(applicationContext, "Clicked Training", Toast.LENGTH_SHORT)
                        .show()*/
                }

                R.id.nav_diet -> {
                    Toast.makeText(applicationContext, "Clicked Diet", Toast.LENGTH_SHORT)
                        .show()
                }

                R.id.nav_settings -> {
                    Toast.makeText(applicationContext, "Clicked Settings", Toast.LENGTH_SHORT)
                        .show()
                }

                R.id.nav_profile -> {
                    val intent_profile = Intent(this , ProfileActivity::class.java)
                    startActivity(intent_profile)

                    /*val intent = Intent(this , ProfileActivity::class.java)
                    startActivity(intent)*/
                    /*Toast.makeText(applicationContext, "Clicked Profile", Toast.LENGTH_SHORT)
                        .show()*/
                }

                R.id.nav_share -> {
                    Toast.makeText(applicationContext, "Clicked Share", Toast.LENGTH_SHORT)
                        .show()
                }

                R.id.nav_rate -> {
                    Toast.makeText(applicationContext, "Clicked Rate", Toast.LENGTH_SHORT)
                        .show()
                }

                R.id.nav_logout -> {
                    Toast.makeText(applicationContext, "Clicked Logout", Toast.LENGTH_SHORT)
                        .show()
                }
            }

            true


        }


        binding.categorymoreBtn.setOnClickListener {
            val intent = Intent(this , CategoryActivity::class.java)
            startActivity(intent)
        }

        binding.profilebackBtn.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }

        /*binding.yourPases.setOnClickListener {
            val intent = Intent(this, PassesActivity::class.java)
            startActivity(intent)
        }*/

        binding.yourSucces.setOnClickListener {
            val intent = Intent(this, SuccesActivity::class.java)
            startActivity(intent)
        }

        binding.yourData.setOnClickListener {
            val intent = Intent(this, YourDataActivity::class.java)
            startActivity(intent)
        }

        binding.addphotoBtn.setOnClickListener {
            dispatchTakePictureIntent()
        }


    }

    private fun dispatchTakePictureIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (takePictureIntent.resolveActivity(packageManager) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            binding.addphotoBtn.setImageBitmap(imageBitmap)
        }
    }



}