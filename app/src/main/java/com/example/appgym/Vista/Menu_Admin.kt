package com.example.appgym.Vista


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.appgym.R

class Menu_Admin : AppCompatActivity() {
    lateinit var BtnAgg:Button
    lateinit var BtnHistorial:Button
    lateinit var BtnIA:Button
    lateinit var BtnSalir:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.usuario_menu)
        BtnAgg=findViewById(R.id.btnAgregar)
        BtnHistorial=findViewById(R.id.btnHistorial)
        BtnIA=findViewById(R.id.btnIA)
        BtnSalir=findViewById(R.id.btnSalir)
        BtnAgg.setOnClickListener {
            val frm1 = Intent(this@Menu_Admin, Nuevo_Peso::class.java)
            startActivity(frm1)
        }
        BtnHistorial.setOnClickListener {
            val frm2 = Intent(this@Menu_Admin, Listado_Historial::class.java)
            startActivity(frm2)
        }
        BtnSalir.setOnClickListener {
            finish()
        }
        BtnIA.setOnClickListener {
            val frm2 = Intent(this@Menu_Admin, com.example.appgym.ia::class.java)
            startActivity(frm2)
        }

    }

}