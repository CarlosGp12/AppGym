package com.example.appgym.Controlador.Request

import com.google.gson.annotations.SerializedName

data class RegistroRequest(
    @SerializedName("username")
    var username: String,

    @SerializedName("password")
    var password: String,

    @SerializedName("celular")
    var celular: String,

    //@SerializedName("id_rol")
    // var precio: Int,
)
