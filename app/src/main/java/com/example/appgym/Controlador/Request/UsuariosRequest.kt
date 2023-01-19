package com.example.appgym.Controlador.Request

import com.google.gson.annotations.SerializedName

data class UsuariosRequest(
    @SerializedName("username")
    var username: String,

    @SerializedName("password")
    var passwords: String

    //@SerializedName("id_rol")
    // var precio: Int,
)
