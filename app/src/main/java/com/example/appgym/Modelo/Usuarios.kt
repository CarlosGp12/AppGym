package com.example.appgym.Modelo

import com.google.gson.annotations.SerializedName
data class Usuarios(
    @SerializedName("id")
    var id: Int,

    @SerializedName("nombre_usuario")
    var nombre: String,

    @SerializedName("contraseña")
    var cantidad: String,

    @SerializedName("id_rol")
    var precio: Int,
)