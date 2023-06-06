package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.loginapplication.R

class CreatingTheEventActivity : AppCompatActivity() {

    lateinit var saveButton: Button
    lateinit var editText: EditText
    lateinit var editTextDate: EditText
    lateinit var editTextTime: EditText
    lateinit var editTextDescription: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creating_the_event)

        saveButton = findViewById(R.id.saveButton)
        editText = findViewById(R.id.editText)
        editTextDate = findViewById(R.id.editTextDate)
        editTextTime = findViewById(R.id.editTextTime)
        editTextDescription = findViewById(R.id.editTextDescription)


        saveButton.setOnClickListener {
            val string = saveButton.text.toString()
            val intent = Intent(applicationContext, CreatedEventActivity::class.java)
            intent.putExtra("event_name", string)
            intent.putExtra("event_date", string)
            intent.putExtra("event_time", string)
            intent.putExtra("event_desc", string)
            startActivity(intent)
        }

        }
    }
