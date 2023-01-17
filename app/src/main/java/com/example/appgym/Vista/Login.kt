package com.example.appgym.Vista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.appgym.R

class Login : AppCompatActivity() {
    lateinit var BtnMenu: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        BtnMenu = findViewById(R.id.btnIniciar)
        BtnMenu.setOnClickListener {
            val frm2 = Intent(this@Login, Menu_Usuario::class.java)
            startActivity(frm2)
        }
    }
    fun irRegistro(view: View) {
        val frm1 = Intent(this@Login, Formulario_Registro::class.java)
        startActivity(frm1)
    }


}