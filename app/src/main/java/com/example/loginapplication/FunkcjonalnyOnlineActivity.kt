package com.example.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class FunkcjonalnyOnlineActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funkcjonalny_online)

        webView = findViewById(R.id.funkcjonalny_online_film)
        webView.webViewClient = WebViewClient()

        val videoId = "CPAjv3OHKps"
        val url = "https://www.youtube.com/embed/$videoId"

        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)
    }
}