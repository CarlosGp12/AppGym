package com.example.appgym.Vista


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.appgym.Controlador.Util.MyMessages
import com.example.appgym.R

class Menu_Usuario : AppCompatActivity() {
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
        val dato = intent.getStringExtra("username")
        BtnAgg.setOnClickListener {
            val frm1 = Intent(this@Menu_Usuario, Nuevo_Peso::class.java)
            frm1.putExtra("username", dato.toString())
            startActivity(frm1)
        }
        BtnHistorial.setOnClickListener {
            val frm2 = Intent(this@Menu_Usuario, Listado_Historial::class.java)
            frm2.putExtra("username", dato.toString())

            startActivity(frm2)
        }
        BtnSalir.setOnClickListener {
            finish()
        }
        BtnIA.setOnClickListener {
            val frm2 = Intent(this@Menu_Usuario, com.example.appgym.ia::class.java)
            startActivity(frm2)
        }

    }

}