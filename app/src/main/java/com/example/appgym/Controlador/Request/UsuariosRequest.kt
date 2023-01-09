package com.example.appgym.Controlador.Request

import com.google.gson.annotations.SerializedName

class UsuariosRequest(
    @SerializedName("nombre_usuario")
    var nombre: String,

    @SerializedName("contraseña")
    var cantidad: String,

    @SerializedName("id_rol")
    var precio: Int,
)
