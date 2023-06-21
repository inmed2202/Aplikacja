package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.example.loginapplication.databinding.ActivityHomePageTrenerBinding
import com.google.android.material.navigation.NavigationView
import com.google.firebase.FirebaseApp

class HomePageTrener : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    private lateinit var binding: ActivityHomePageTrenerBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        binding = ActivityHomePageTrenerBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
                    val intent_home = Intent(this, HomePageActivity::class.java)
                    startActivity(intent_home)
                }

                R.id.nav_training -> {
                    val intent_trennings = Intent(this, TrainingsActivity::class.java)
                    startActivity(intent_trennings)
                }

                R.id.nav_diet -> {
                    val intent_diet = Intent(this, DietPlanActivity::class.java)
                    startActivity(intent_diet)
                }

                R.id.nav_profile -> {
                    val intent_profile = Intent(this, ProfileActivity::class.java)
                    startActivity(intent_profile)
                }

                R.id.nav_share -> {
                }

                R.id.nav_rate -> {
                }

                R.id.nav_settings -> {
                    val intent_settings = Intent(this, SettingsActivity::class.java)
                    startActivity(intent_settings)
                }

                R.id.nav_logout -> {
                    val intent_logout = Intent(this, MainActivity::class.java)
                    startActivity(intent_logout)
                }


            }

            true
        }
    }



}


