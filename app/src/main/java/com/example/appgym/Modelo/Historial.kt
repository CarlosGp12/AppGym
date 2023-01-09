package com.example.appgym.Modelo

import com.google.gson.annotations.SerializedName
import java.util.Date

data class Historial(
    @SerializedName("id")
    var id: Int,

    @SerializedName("usuario")
    var nombre: String,

    @SerializedName("peso")
    var cantidad: Float,

    @SerializedName("factor_crecimiento")
    var precio: Float,

    @SerializedName("fecha")
    var total: Date
)