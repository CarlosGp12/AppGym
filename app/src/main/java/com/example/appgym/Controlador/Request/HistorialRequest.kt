package com.example.appgym.Controlador.Request

import com.google.gson.annotations.SerializedName
import java.util.*

data class HistorialRequest (

    @SerializedName("peso")
    var peso: Float,
)