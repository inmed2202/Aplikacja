package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.loginapplication.databinding.ActivityHomePageBinding
import com.example.loginapplication.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth

class HomePageActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var binding : ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        setContentView(R.layout.activity_home_page)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

            /*firebaseAuth = FirebaseAuth.getInstance()

        val displayName = intent.getStringExtra("name")

        findViewById<TextView>(R.id.textView).text = "Witaj, " + "\n" + displayName

        findViewById<ImageButton>(R.id.logout_btn).setOnClickListener {
            firebaseAuth.signOut()
            startActivity(Intent(this, MainActivity::class.java))
        }*/
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
                        Toast.makeText(applicationContext, "Clicked Training", Toast.LENGTH_SHORT)
                            .show()
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

    }


}