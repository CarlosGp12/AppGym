package com.example.appgym.Controlador.Request

import com.google.gson.annotations.SerializedName
import java.util.*

data class HistorialRequest (

    @SerializedName("usuario")
    var usuario: String,

    @SerializedName("peso")
    var peso: Float,
)