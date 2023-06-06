package com.example.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class BoksOnlineActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boks_online)

        webView = findViewById(R.id.boks_online_film)
        webView.webViewClient = WebViewClient()

        val videoId = "kbgkeTTSau8"
        val url = "https://www.youtube.com/embed/$videoId"

        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)
    }
}