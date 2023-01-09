package com.example.appgym.Vista


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.appgym.R

class Menu_Usuario : AppCompatActivity() {
    lateinit var BtnAgg:Button
    lateinit var BtnHistorial:Button
    lateinit var BtnSalir:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_usuario)
        BtnAgg=findViewById(R.id.btnAgregar)
        BtnHistorial=findViewById(R.id.btnHistorial)
        BtnSalir=findViewById(R.id.btnSalir)
        BtnAgg.setOnClickListener {
            val frm1 = Intent(this@Menu_Usuario, Nuevo_Peso::class.java)
            startActivity(frm1)
        }
        BtnSalir.setOnClickListener {
            finish()
        }

    }

    fun Agregar(view: View){

    }
}