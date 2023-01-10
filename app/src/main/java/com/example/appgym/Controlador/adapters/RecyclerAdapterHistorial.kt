package com.example.appgym.Controlador.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appgym.Modelo.Historial
import com.example.appgym.R

class RecyclerAdapterHistorial(val historial: List<Historial>) : RecyclerView.Adapter<MyViewHolderHistorial>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolderHistorial {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view  = layoutInflater.inflate(R.layout.admin_row_historial, parent, false)
        val viewHolder = MyViewHolderHistorial(view)
        return viewHolder
    }
    override fun getItemCount(): Int {
        return historial.size
    }
    override fun onBindViewHolder(holder: MyViewHolderHistorial, position: Int) {
        historial.get(position)?.let { holder.bind(it) }
    }
}