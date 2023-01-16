package com.example.appgym.Controlador.Request

import com.google.gson.annotations.SerializedName

data class UsuariosRequest(
    @SerializedName("nombre_usuario")
    var nombre_usuario: String,

    @SerializedName("contraseña")
    var contraseña: String,

    @SerializedName("telefono")
    var telefono: Int
)
