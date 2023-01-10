package com.example.appgym.Controlador.adapters

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appgym.Controlador.Util.MyMessages
import com.example.appgym.Modelo.Clientes
import com.example.appgym.R
import com.example.appgym.Vista.Nuevo_Peso

open class `MyViewHolderPesos-usuario`(itemView: View) : RecyclerView.ViewHolder(itemView) {

    lateinit var fecha: TextView
    lateinit var peso: TextView

    fun bind(clientes: Clientes) {
        fecha = itemView.findViewById(R.id.txtFecha2)
        peso = itemView.findViewById(R.id.txtPesos2)

        peso.text = clientes.toString()
        fecha.text = clientes.toString()

        //Click para agregar creo
        itemView.setOnClickListener {
            MyMessages.toast(itemView.context, clientes.nombre.toString())
            //Nuevo_Peso es para agregar un nuevo peso ni idea donde
            val intent = Intent(itemView.context, Nuevo_Peso::class.java)
            intent.putExtra("per_id", peso.id)
            itemView.context.startActivity(intent)
        }
    }
}