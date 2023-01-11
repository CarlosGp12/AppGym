package com.example.appgym.Vista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.appgym.R

class iaPrediccion : AppCompatActivity() {
    lateinit var webview: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ia_prediccion)

        WebView()
    } fun WebView(){
        webview = findViewById(R.id.webview)
        webview.loadUrl("https://proyectoprimerparcial-71aae.firebaseapp.com/%22")
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