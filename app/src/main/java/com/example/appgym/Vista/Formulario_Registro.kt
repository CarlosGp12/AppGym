package com.example.appgym.Vista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appgym.R
import com.example.appgym.R.id.btnVolver

class Formulario_Registro : AppCompatActivity() {
    lateinit var BtnVolver:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fomulario_registro)
        BtnVolver=findViewById(btnVolver)
        BtnVolver.setOnClickListener {
            //val form = Intent(this@registro, MainActivity::class.java)
            //startActivity(form)
            finish()
        }
    }
}