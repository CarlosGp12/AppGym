package com.example.appgym.Vista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appgym.R

class Nuevo_Peso : AppCompatActivity() {
    lateinit var BtnVolver3: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.nuevo_peso)
        BtnVolver3 = findViewById(R.id.btnVolver3)
        BtnVolver3.setOnClickListener {
            val frm2 = Intent(this@Nuevo_Peso, Menu_Usuario::class.java)
            startActivity(frm2)
        }
    }

}