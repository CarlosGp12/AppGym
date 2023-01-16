package com.example.appgym.Vista

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appgym.Controlador.Responses.HistorialResponse
import com.example.appgym.Controlador.Util.MyMessages
import com.example.appgym.Controlador.adapters.RecyclerAdapterHistorial
import com.example.appgym.Modelo.Historial
import com.example.appgym.Modelo.services.ApiGym
import com.example.appgym.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Listado_Historial : AppCompatActivity() {
    private lateinit var apihistorial: ApiGym
    var datalist = ArrayList<Historial>()
    lateinit var recyclerview: RecyclerView
    lateinit var adpater: RecyclerAdapterHistorial

    override fun onResume() {
        super.onResume()
        CoroutineScope(Dispatchers.IO).launch {
            cargarDatos()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.admin_lista_historial)
        apihistorial = ApiGym()
        recyclerview = findViewById(R.id.Recycler_historial)
    }

    private fun cargarDatos() {
        apihistorial.getApiService(this).getListHistorial()
            .enqueue(object : Callback<HistorialResponse> {
                override fun onResponse(
                    call: Call<HistorialResponse>,
                    response: Response<HistorialResponse>
                ) {
                    val liseProducto = response.body()?.historial
                    if (liseProducto != null) {
                        recyclerview.apply {
                            layoutManager = LinearLayoutManager(this@Listado_Historial)
                            adapter = RecyclerAdapterHistorial(liseProducto)
                        }
                    } else {
                        MyMessages.toast(applicationContext, "no existen registro")
                    }
                }

                override fun onFailure(call: Call<HistorialResponse>, t: Throwable) {
                    MyMessages.toast(applicationContext, t.toString())
                }

            })
    }

    /* fun menuHome(item: MenuItem) {
         *//* when (item.getItemId()) {
             *//**//*R.id.add -> {
                Toast.makeText(this, "Nuevo Registro", Toast.LENGTH_SHORT).show()*//*
        val intent = Intent(this, Agregar::class.java).apply {

        }
        startActivity(intent)


    }*/


    fun volver (view: View){
        finish()
    }
}