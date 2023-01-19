package com.example.appgym.Modelo.services

import com.example.appgym.Controlador.Request.HistorialRequest
import com.example.appgym.Controlador.Request.HistorialRequest2
import com.example.appgym.Controlador.Request.RegistroRequest
import com.example.appgym.Controlador.Request.UsuariosRequest
import com.example.appgym.Controlador.Responses.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @Headers("Accept:application/json", "Content-Type:application/json")

    //Obtecion del GET
    @GET("/historial")
    fun getListHistorial(): Call<HistorialResponse>
    @GET("/usuario")
    fun getListUsuarios(): Call<UsuariosResponse>

    //Envio de datos por POST
    @POST("/historial/add")
    fun addHistorial(@Body request: HistorialRequest): Call<DefaultResponse>
    @POST("/historial/add2")
    fun addHistorial2(@Body request: HistorialRequest2): Call<DefaultResponse>
    @GET("/historial/add2")
    fun getListHistorialUsuario2(): Call<HistorialResponse2>
    @GET("/historial/:usuario")
    fun getListHistorialUsuario(): Call<HistorialResponse>


    //Registro
    @POST("/usuario/adduser")
    fun adduser(@Body request: RegistroRequest): Call<DefaultResponse>

    //Login
    @POST("/usuario/auth")
    fun Auth(@Body request: UsuariosRequest): Call<LoginResponse>

    //Actualizacion de datos por PUT
    /*@PUT("/update_dato/{id}")
    fun updateEmployee(@Path("id") id: Int, @Body request: ProductosRequest): Call<DefaultResponse>
    @DELETE("/delete_dato/{emp_id}")
    fun deleteEmployee(@Path("emp_id") emp_id: Int): Call<DefaultResponse>*/

}