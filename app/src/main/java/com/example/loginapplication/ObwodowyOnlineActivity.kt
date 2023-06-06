package com.example.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class ObwodowyOnlineActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obwodowy_online)

        webView = findViewById(R.id.obwodowy_online_film)
        webView.webViewClient = WebViewClient()

        val videoId = "TRENING OBWODOWY CAŁEGO CIAŁA \uD83D\uDCAA | HANTLE, GUMY MINI BAND | KETTLEBELL | FULL BODY | Agata Zając"
        val url = "https://www.youtube.com/watch?v=Bh-9MciTr5U$videoId"
        webView.loadUrl(url)
    }
}