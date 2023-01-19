package com.example.appgym.Controlador.Responses

data class DefaultResponse(
    val status_code: Int,
    val error: Boolean,
    val message: String
)