package com.example.appgym.Modelo

import com.google.gson.annotations.SerializedName
data class Clientes(
    @SerializedName("id")
    var id: Int,

    @SerializedName("nombre")
    var nombre: String,

    @SerializedName("peso")
    var peso: Float,

    @SerializedName("altura")
    var altura: Float,

    @SerializedName("telefono")
    var telefono: String
)
