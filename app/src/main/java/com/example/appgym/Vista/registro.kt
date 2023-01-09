package com.example.appgym.Vista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.appgym.R
import com.example.appgym.R.id.btnVolver
import com.example.appgym.R.id.btnVolver2

class registro : AppCompatActivity() {
    lateinit var BtnVolver:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        BtnVolver=findViewById(btnVolver)
        BtnVolver.setOnClickListener {
            //val form = Intent(this@registro, MainActivity::class.java)
            //startActivity(form)
            finish()
        }
    }
}