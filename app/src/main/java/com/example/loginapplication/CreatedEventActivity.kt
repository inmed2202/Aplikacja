package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CreatedEventActivity : AppCompatActivity() {
    lateinit var enteredName: TextView
    lateinit var enteredDate: TextView
    lateinit var enteredTime: TextView
    lateinit var enteredDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_created_event)

        enteredName = findViewById(R.id.enteredName)
        enteredDate = findViewById(R.id.enteredDate)
        enteredTime = findViewById(R.id.enteredTime)
        enteredDesc = findViewById(R.id.enteredDesc)

        val intent = intent

        val string = intent.getStringExtra("event_name")
        enteredName.text = string
        val string1 = intent.getStringExtra("event_date")
        enteredDate.text = string1
        val string2 = intent.getStringExtra("event_time")
        enteredTime.text = string2
        val string3 = intent.getStringExtra("event_desc")
        enteredDesc.text = string3
    }
}