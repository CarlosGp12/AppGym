package com.example.appgym.Vista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.appgym.Controlador.Request.UsuariosRequest
import com.example.appgym.Controlador.Responses.LoginResponse
import com.example.appgym.Controlador.Util.MyMessages
import com.example.appgym.Modelo.services.ApiGym
import com.example.appgym.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Login : AppCompatActivity() {
    lateinit var TxtUsername: EditText
    lateinit var TxtPassword: EditText
    lateinit var BtnMenu: Button
    lateinit var BtnRegistro: Button
    lateinit var apiGym: ApiGym
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        TxtUsername = findViewById(R.id.TxtUsername)
        TxtPassword = findViewById(R.id.TxtPassword)
        apiGym = ApiGym()
        BtnMenu = findViewById(R.id.btnIniciar)
        BtnRegistro  = findViewById(R.id.btnRegistrar)
        BtnMenu.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                Login()
            }
        }

        BtnRegistro.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                irRegistro()
            }
        }
    }
    fun irRegistro() {
        val frm1 = Intent(this@Login, Formulario_Registro::class.java)
        startActivity(frm1)
    }



    private suspend fun Login() {
        val Username = TxtUsername.text.toString().trim()
        val Password = TxtPassword.text.toString().trim()

        if (Username.isEmpty()) {
            withContext(Dispatchers.Main) {
                TxtUsername.error = "Ingrese el Usuario"
                TxtUsername.requestFocus()
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
        apiGym.getApiService(this).Auth(UsuariosRequest(Username, Password))
            .enqueue(object : Callback<LoginResponse> {
                override fun onResponse(
                    call: Call<LoginResponse>,
                    response: Response<LoginResponse>
                ) {
                   // MyMessages.toast(applicationContext, response.body().toString() )

                   val defaultResponse = response.body()
                    if (response.body().toString().contains("false")){

                        CoroutineScope(Dispatchers.IO).launch {
                          frm2()}

                        /*if (response.body().toString().contains("2")){
                            MyMessages.toast(applicationContext, "usuario")

//                            CoroutineScope(Dispatchers.IO).launch {
//                                frm2()
//                            }
                        }else {
                            MyMessages.toast(applicationContext, "Admin")
                        }
*/
                    } else {
                        MyMessages.toast(applicationContext, "Informacion Incorrecta")
                    }
                }

                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    MyMessages.toast(applicationContext, t.toString())
                }

            })
    }
    fun frm2() {
        val frm2 = Intent(this@Login, Menu_Usuario::class.java)
        startActivity(frm2)
    }
}