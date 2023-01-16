package com.example.appgym.Controlador.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appgym.Modelo.Clientes
import com.example.appgym.R

class RecyclerAdapterClientes(val clientelist: List<Clientes>) : RecyclerView.Adapter<MyViewHolderClientes>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolderClientes {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view  = layoutInflater.inflate(R.layout.admin_row_clientes, parent, false)
        val viewHolder = MyViewHolderClientes(view)
        return viewHolder
    }
    override fun getItemCount(): Int {
        return clientelist.size
    }
    override fun onBindViewHolder(holder: MyViewHolderClientes, position: Int) {
        clientelist.get(position)?.let { holder.bind(it) }
    }
}