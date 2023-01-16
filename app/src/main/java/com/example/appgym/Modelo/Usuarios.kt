package com.example.appgym.Modelo

import com.google.gson.annotations.SerializedName
data class Usuarios(
    @SerializedName("id")
    var id: Int,

    @SerializedName("nombre_usuario")
    var nombre_usuario: String,

    @SerializedName("contraseña")
    var contraseña: String,

    @SerializedName("telefono")
    var telefono: Int,
)