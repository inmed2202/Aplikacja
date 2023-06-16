package com.example.loginapplication


import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.loginapplication.databinding.ActivityHomePageBinding
import com.google.android.material.navigation.NavigationView
import com.google.firebase.FirebaseApp


class HomePageActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    private lateinit var binding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
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
                    shareApp()
                }

                R.id.nav_rate -> {
                    rateUs()
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

        //online
        binding.hpcrossfitBtnImg.setOnClickListener {
            val intent = Intent(this , CrossfitOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.hpsilowyBtnImg.setOnClickListener {
            val intent = Intent(this , SilowyOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.hpboksBtnImg.setOnClickListener {
            val intent = Intent(this , BoksOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.hpfunkcjonalnyBtnImg.setOnClickListener {
            val intent = Intent(this , FunkcjonalnyOnlineActivity::class.java)
            startActivity(intent)
        }

        binding.hprelaksacyjnyBtnImg.setOnClickListener {
            val intent = Intent(this , StratchingOnlineActivity::class.java)
            startActivity(intent)
        }


    //offline
        binding.hpdlapanBtnImg.setOnClickListener {
            val intent = Intent(this , TreningCardioActivity::class.java)
            startActivity(intent)
        }

        binding.hpdlapanowBtnImg.setOnClickListener {
            val intent = Intent(this , TreningSilowyActivity::class.java)
            startActivity(intent)
        }

        binding.hpboks2BtnImg.setOnClickListener {
            val intent = Intent(this , BoksActivity::class.java)
            startActivity(intent)
        }

        binding.hpjogaBtnImg.setOnClickListener {
            val intent = Intent(this , JogaActivity::class.java)
            startActivity(intent)
        }

        binding.hpstratchingBtnImg.setOnClickListener {
            val intent = Intent(this , StratchingActivity::class.java)
            startActivity(intent)
        }

    }

    private fun shareApp() {
        val appUrl = "https://www.example.com/link_do_pobrania_aplikacji"

        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Pobierz moją aplikację")
        shareIntent.putExtra(Intent.EXTRA_TEXT, appUrl)

        val packageManager = packageManager
        if (shareIntent.resolveActivity(packageManager) != null) {
            startActivity(Intent.createChooser(shareIntent, "Udostępnij link za pomocą"))
        }
    }

    private fun rateUs() {
        val packageName = packageName
        val marketIntent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName"))
        val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$packageName"))

        try {
            startActivity(marketIntent)
        } catch (e: ActivityNotFoundException) {
            startActivity(webIntent)
        }
    }
}
