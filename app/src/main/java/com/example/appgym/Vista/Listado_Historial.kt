package com.example.appgym.Vista

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appgym.Controlador.Request.HistorialRequest
import com.example.appgym.Controlador.Request.HistorialRequest2
import com.example.appgym.Controlador.Responses.DefaultResponse
import com.example.appgym.Controlador.Responses.HistorialResponse
import com.example.appgym.Controlador.Responses.HistorialResponse2
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
import kotlin.math.log

class Listado_Historial : AppCompatActivity() {
    private lateinit var apihistorial: ApiGym
    var datalist = ArrayList<Historial>()
    lateinit var recyclerview: RecyclerView
    lateinit var adpater: RecyclerAdapterHistorial

    override fun onResume() {
        super.onResume()
        CoroutineScope(Dispatchers.IO).launch {
            enviarDatos()
            cargarDatos()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.admin_lista_historial)
        apihistorial = ApiGym()
        recyclerview = findViewById(R.id.Recycler_historial)
    }

    fun enviarDatos(){
        val dato = intent.getStringExtra("username")
        val usuario = dato.toString()

        Log.v(usuario, "Que es Usuario")
        apihistorial.getApiService(this)
            .addHistorial2(HistorialRequest2(usuario))
            .enqueue(object : Callback<DefaultResponse> {
                override fun onResponse(
                    call: Call<DefaultResponse>,
                    response: Response<DefaultResponse>
                ) {
                    val defaultResponse = response.body()
                    if (defaultResponse != null) {
                        if (response.code() == 200 && defaultResponse.error == false) {
                            MyMessages.toast(applicationContext, defaultResponse.message)
                            return
                        }
                    } else {
                        MyMessages.toast(applicationContext, "Error al agregar envia datos vacios")
                    }
                }

                override fun onFailure(call: Call<DefaultResponse>, t: Throwable) {
                    MyMessages.toast(applicationContext, t.toString())
                }

            })
    }
    fun cargarDatos() {
                apihistorial.getApiService(this).getListHistorialUsuario2()
            .enqueue(object : Callback<HistorialResponse2> {
                override fun onResponse(
                    call: Call<HistorialResponse2>,
                    response: Response<HistorialResponse2>
                ) {
                    val liseProducto = response.body()?.historial2
                    if (liseProducto != null) {
                        recyclerview.apply {
                            layoutManager = LinearLayoutManager(this@Listado_Historial)
                            adapter = RecyclerAdapterHistorial(liseProducto)
                        }
                    } else {
                        MyMessages.toast(applicationContext, "no existen registro")
                    }
                }

                override fun onFailure(call: Call<HistorialResponse2>, t: Throwable) {
                    MyMessages.toast(applicationContext, t.toString())
                }

            })
    }

    fun volver (view: View){
        finish()
    }
}