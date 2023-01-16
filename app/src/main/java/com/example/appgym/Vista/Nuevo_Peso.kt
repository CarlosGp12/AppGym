package com.example.appgym.Vista

import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import com.example.appgym.Controlador.Request.HistorialRequest
import com.example.appgym.Controlador.Responses.DefaultResponse
import com.example.appgym.Controlador.Util.MyMessages
import com.example.appgym.Modelo.services.ApiGym
import com.example.appgym.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*


class Nuevo_Peso : AppCompatActivity() {
    private lateinit var apiUsuario: ApiGym
    lateinit var TxtPeso: EditText
    lateinit var BtnAgregarPeso: EditText
    lateinit var BtnVolver3: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.usuario_agregar_nuevo_peso)
        apiUsuario = ApiGym()
        BtnVolver3 = findViewById(R.id.btnVolver3)
        TxtPeso = findViewById(R.id.txtNuevopeso)
        BtnAgregarPeso = findViewById(R.id.btnAgregarPeso)
        BtnVolver3.setOnClickListener {
            val frm2 = Intent(this@Nuevo_Peso, Menu_Usuario::class.java)
            startActivity(frm2)
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun AddPeso() {
        val usuario = TxtPeso.text.toString()
        val peso = TxtPeso.text.toString().toFloat()
        val factor_crecimiento = TxtPeso.text.toString().toFloat()
        val convertidor = TxtPeso.text.toString()
        val format = SimpleDateFormat("yyyy-MM-dd")
        val fecha: Date = format.parse(convertidor)

        //ApiRest
        /* apiUsuario.getApiService(this)
            .addHistorial(HistorialRequest(usuario, peso, factor_crecimiento, fecha))
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
    }*/

        fun regregar(view: View) {
            finish()
        }
    }
}

