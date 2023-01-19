package com.example.appgym.Controlador.Responses

data class LoginResponse(
    val status_code: Int,
    val error: Boolean,
    val message: String,
    val token: String,
    val rol: Int

)