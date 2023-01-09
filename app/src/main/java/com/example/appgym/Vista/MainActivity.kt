package com.example.appgym.Vista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.appgym.R

class MainActivity : AppCompatActivity() {
    lateinit var BtnMenu: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnMenu = findViewById(R.id.btnIniciar)
        BtnMenu.setOnClickListener {
            val frm2 = Intent(this@MainActivity, Menu::class.java)
            startActivity(frm2)
        }
    }
    fun irRegistro(view: View) {
        val frm1 = Intent(this@MainActivity, registro::class.java)
        startActivity(frm1)
    }

}