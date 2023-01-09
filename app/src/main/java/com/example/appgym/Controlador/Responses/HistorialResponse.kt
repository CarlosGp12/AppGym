package com.example.appgym.Controlador.Responses

import com.example.appgym.Modelo.Clientes
import com.example.appgym.Modelo.Historial
import com.google.gson.annotations.SerializedName

data class HistorialResponse(
    @SerializedName("status_code")
    var status: Int,

    @SerializedName("message")
    var message: String,

    @SerializedName("historial")
    var historial: List<Historial>
)