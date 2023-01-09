package com.example.appgym.Controlador.Responses

import com.example.appgym.Modelo.Historial
import com.example.appgym.Modelo.Usuarios
import com.google.gson.annotations.SerializedName

data class UsuariosResponse(
    @SerializedName("status_code")
    var status: Int,

    @SerializedName("message")
    var message: String,

    @SerializedName("usuarios")
    var usuarios: List<Usuarios>
)