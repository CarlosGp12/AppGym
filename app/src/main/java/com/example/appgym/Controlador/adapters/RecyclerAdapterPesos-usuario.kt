package com.example.appgym.Controlador.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appgym.Modelo.Clientes
import com.example.appgym.R

class `RecyclerAdapterPesos-usuario`(val usuario: List<Clientes>) : RecyclerView.Adapter<`MyViewHolderPesos-usuario`>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): `MyViewHolderPesos-usuario` {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view  = layoutInflater.inflate(R.layout.usuario_row_pesos, parent, false)
        val viewHolder = `MyViewHolderPesos-usuario`(view)
        return viewHolder
    }
    override fun getItemCount(): Int {
        return usuario.size
    }
    override fun onBindViewHolder(holder: `MyViewHolderPesos-usuario`, position: Int) {
        usuario.get(position)?.let { holder.bind(it) }
    }
}