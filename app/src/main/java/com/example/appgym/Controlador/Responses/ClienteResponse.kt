package com.example.appgym.Controlador.Responses

import com.example.appgym.Modelo.Clientes
import com.google.gson.annotations.SerializedName

data class ClienteResponse(
    @SerializedName("status_code")
    var status: Int,

    @SerializedName("message")
    var message: String,

    @SerializedName("clientes")
    var clientes: List<Clientes>
)