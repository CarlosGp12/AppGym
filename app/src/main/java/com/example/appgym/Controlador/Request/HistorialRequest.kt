package com.example.appgym.Controlador.Request

import com.google.gson.annotations.SerializedName
import java.util.*

class HistorialRequest (

    @SerializedName("usuario")
    var nombre: String,

    @SerializedName("peso")
    var cantidad: Float,

    @SerializedName("factor_crecimiento")
    var precio: Float,

    @SerializedName("fecha")
    var total: Date
)