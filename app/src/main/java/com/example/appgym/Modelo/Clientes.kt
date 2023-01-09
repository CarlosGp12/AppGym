package com.example.appgym.Modelo

import com.google.gson.annotations.SerializedName
data class Clientes(
    @SerializedName("id")
    var id: Int,

    @SerializedName("nombre")
    var nombre: String,

    @SerializedName("peso")
    var cantidad: Float,

    @SerializedName("altura")
    var precio: Float,

    @SerializedName("telefono")
    var total: String
)
