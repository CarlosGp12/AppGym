package com.example.appgym.Modelo

import com.google.gson.annotations.SerializedName
import java.util.Date

data class Historial(
    @SerializedName("id")
    var id: Int,

    @SerializedName("usuario")
    var usuario: String,

    @SerializedName("peso")
    var peso: Float,

    @SerializedName("factor_crecimiento")
    var factor_crecimiento: Float,

    @SerializedName("fecha")
    var fecha: Date
)