package com.example.appgym.Controlador.Request

import com.google.gson.annotations.SerializedName
import java.util.*

data class HistorialRequest2 (

    @SerializedName("usuario")
    var usuario: String,
)