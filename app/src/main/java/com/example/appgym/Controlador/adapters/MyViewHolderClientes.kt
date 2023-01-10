package com.example.appgym.Controlador.adapters

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appgym.Controlador.Util.MyMessages
import com.example.appgym.Modelo.Clientes
import com.example.appgym.R
import com.example.appgym.Vista.Nuevo_Peso

open class MyViewHolderClientes(itemView: View) : RecyclerView.ViewHolder(itemView) {

    lateinit var factorc: TextView
    lateinit var fecha : TextView
    lateinit var pesos: TextView

    fun bind(clientes: Clientes) {
        factorc = itemView.findViewById(R.id.txtFactorC)
        fecha = itemView.findViewById(R.id.txtFecha)
        pesos=itemView.findViewById(R.id.txtPesos)

        factorc.text = clientes?.nombre
        fecha.text = clientes.id.toString()
        pesos.text=clientes.peso.toString()

        itemView.setOnClickListener {
            MyMessages.toast(itemView.context, clientes?.nombre.toString())
            //Nuevo_Peso es para agregar un nuevo peso ni idea donde
            val intent = Intent(itemView.context, Nuevo_Peso::class.java)
            intent.putExtra("per_id", factorc.id)
            itemView.context.startActivity(intent)
        }
    }


}