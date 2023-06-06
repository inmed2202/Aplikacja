package com.example.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class SilowyOnlineActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_silowy_online)

        webView = findViewById(R.id.silowy_online_film)
        webView.webViewClient = WebViewClient()

        val videoId = "Q7V1pA6PQPI"
        val url = "https://www.youtube.com/embed/$videoId"

        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)
    }
}