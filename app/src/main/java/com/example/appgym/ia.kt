package com.example.appgym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class ia : AppCompatActivity() {
    lateinit var webview: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ia)
        WebView()
    } fun WebView(){
        webview = findViewById(R.id.webview)
        webview.loadUrl("https://iaprediccionplatmov.firebaseapp.com/")
        webview.settings.allowFileAccess=true
        webview.settings.javaScriptEnabled=true
        webview.webViewClient= WebViewClient()
    }

    override fun onBackPressed() {
        if (webview.canGoBack()){
            webview.goBack()
        }else{
            super.onBackPressed()
        }
    }
}