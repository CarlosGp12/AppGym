package com.example.appgym.Controlador.adapters

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appgym.Controlador.Util.MyMessages
import com.example.appgym.Modelo.Historial
import com.example.appgym.R
import com.example.appgym.Vista.Nuevo_Peso

open class MyViewHolderHistorial(itemView: View) : RecyclerView.ViewHolder(itemView) {

    lateinit var factorC: TextView
    lateinit var peso: TextView
    lateinit var fecha: TextView

    fun bind(clientes: Historial) {
        factorC = itemView.findViewById(R.id.txtFactorC)
        peso = itemView.findViewById(R.id.txtPesos)
        fecha = itemView.findViewById(R.id.txtFecha)

        factorC.text = clientes.toString()
        peso.text = clientes.toString()
        fecha.text = clientes.toString()

        //Click para agregar creo
        itemView.setOnClickListener {
            MyMessages.toast(itemView.context, clientes.usuario.toString())
            //Nuevo_Peso es para agregar un nuevo Speso ni idea donde
            val intent = Intent(itemView.context, Nuevo_Peso::class.java)
            intent.putExtra("per_id", factorC.id)
            itemView.context.startActivity(intent)
        }
    }
}