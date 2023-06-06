package com.example.loginapplication

import android.Manifest
import android.content.ContentResolver
import android.content.ContentValues
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.loginapplication.databinding.ActivityStratchingBinding
import java.util.*

class StratchingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStratchingBinding

    companion object {
        private const val CALENDAR_PERMISSION_REQUEST_CODE = 101
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStratchingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.zapisBtn.setOnClickListener {
            checkCalendarPermission()
        }
    }

    private fun checkCalendarPermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_CALENDAR
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            addEventToCalendar()
        } else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.WRITE_CALENDAR),
                CALENDAR_PERMISSION_REQUEST_CODE
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == CALENDAR_PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                addEventToCalendar()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Permission denied. Cannot add event to calendar.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun addEventToCalendar() {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, 12)
        calendar.set(Calendar.MINUTE, 0)

        val startMillis = calendar.timeInMillis
        calendar.add(Calendar.HOUR_OF_DAY, 1)
        val endMillis = calendar.timeInMillis

        val cr: ContentResolver = contentResolver
        val values = ContentValues()
        values.put(CalendarContract.Events.DTSTART, startMillis)
        values.put(CalendarContract.Events.DTEND, endMillis)
        values.put(CalendarContract.Events.TITLE, "Stratching")
        values.put(CalendarContract.Events.DESCRIPTION, "Trening ze Stratchingu")
        values.put(CalendarContract.Events.CALENDAR_ID, 1)
        values.put(CalendarContract.Events.EVENT_TIMEZONE, TimeZone.getDefault().id)

        val uri: Uri? = cr.insert(CalendarContract.Events.CONTENT_URI, values)

        if (uri != null) {
            Toast.makeText(
                applicationContext,
                "Notatka zastała dodana.",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            Toast.makeText(
                applicationContext,
                "Notatka nie została dodana.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}