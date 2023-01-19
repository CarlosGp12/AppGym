package com.example.appgym.Vista


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.appgym.Controlador.Request.RegistroRequest
import com.example.appgym.R
import com.example.appgym.R.id.*
import com.example.appgym.Modelo.services.ApiGym
import com.example.appgym.Controlador.Responses.DefaultResponse
import com.example.appgym.Controlador.Util.MyMessages
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Formulario_Registro : AppCompatActivity() {
    lateinit var TxtUsername: EditText
    lateinit var TxtPassword: EditText
    lateinit var TxtCelular: EditText
    lateinit var BtnVolver:Button
    lateinit var BtnRegistrar: Button
    lateinit var apiGym: ApiGym
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fomulario_registro)
        TxtUsername = findViewById(TxtUsernameR)
        TxtPassword = findViewById(TxtPasswordR)
        TxtCelular = findViewById(TxtCelularR)
        BtnVolver = findViewById(btnVolver)
        BtnRegistrar = findViewById(btnResgister)
        apiGym = ApiGym()
        BtnVolver.setOnClickListener {
            finish()
        }

        BtnRegistrar.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                Registro()
            }

        }
    }
    private suspend fun Registro() {
        val Username = TxtUsername.text.toString().trim()
        val Password = TxtPassword.text.toString().trim()
        val Celular=TxtCelular.text.toString().trim()

        if (Username.isEmpty()) {
            withContext(Dispatchers.Main) {
                TxtUsername.error = "Ingrese el Usuario"
                TxtUsername.requestFocus()
            }
            return
        }

        if (Celular.isEmpty()) {
            withContext(Dispatchers.Main) {
                TxtCelular.error = "Ingrese el #Celular"
                TxtCelular.requestFocus()
            }
            return
        }

        if (Password.isEmpty()) {
            withContext(Dispatchers.Main) {
                TxtPassword.error = "Ingrese la Contraseña"
                TxtPassword.requestFocus()
            }
            return
        }


        apiGym.getApiService(this).adduser(RegistroRequest(Username, Password, Celular))
            .enqueue(object: Callback<DefaultResponse> {
                override fun onResponse(
                    call: Call<DefaultResponse>,
                    response: Response<DefaultResponse>
                ) {
                    val defaultResponse=response.body()
                    if ( defaultResponse!= null) {
                        if (defaultResponse.error==false){
                            MyMessages.toast(applicationContext,defaultResponse.message)
                            return
                        }else{
                            MyMessages.toast(applicationContext,defaultResponse.message)
                            return
                        }
                    }else{
                        MyMessages.toast(applicationContext,"Error")
                    }
                }

                override fun onFailure(call: Call<DefaultResponse>, t: Throwable) {
                    MyMessages.toast(applicationContext,t.toString())
                }

            })
    }

}