package com.example.appgym.Controlador.Request

import com.google.gson.annotations.SerializedName
data class ClientesRequest(

    @SerializedName("nombre")
    var nombre: String,

    @SerializedName("peso")
    var cantidad: Float,

    @SerializedName("altura")
    var precio: Float,

    @SerializedName("telefono")
    var total: String
)