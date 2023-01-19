package com.example.appgym.Controlador.Responses

import com.example.appgym.Modelo.Historial
import com.google.gson.annotations.SerializedName

data class HistorialResponse2(
    @SerializedName("status_code")
    var status: Int,

    @SerializedName("message")
    var message: String,

    @SerializedName("historial2")
    var historial2: List<Historial>
)