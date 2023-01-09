package com.example.appgym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun irRegistro(view: View) {
        val frm1 = Intent(this@MainActivity, registro::class.java)
        startActivity(frm1)
    }
}