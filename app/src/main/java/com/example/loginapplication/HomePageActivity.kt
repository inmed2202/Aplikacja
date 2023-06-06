package com.example.loginapplication

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.loginapplication.databinding.ActivityHomePageBinding
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomePageActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var binding : ActivityHomePageBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemList: List<Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
                        Toast.makeText(applicationContext, "Clicked Home", Toast.LENGTH_SHORT)
                            .show()
                    }

                    R.id.nav_training -> {
                        val intent_trennings = Intent(this , TrenningsActivity::class.java)
                        startActivity(intent_trennings)
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
                        val intent_signin = Intent(this, MainActivity::class.java)
                        startActivity(intent_signin)
                    }
                }

                true


            }


    }

    private fun generateItemList(): MutableList<Item> {
        val itemList = mutableListOf<Item>()

        itemList.add(Item("Trening"))
        itemList.add(Item("Trener"))
        itemList.add(Item("Plan dietetyczny"))
        itemList.add(Item("Jadłospis"))

        return itemList
    }

    data class Item(val buttonText: String)

}