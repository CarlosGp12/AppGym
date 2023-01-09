package com.example.appgym.Modelo.services

import com.example.appgym.Controlador.Request.ClientesRequest
import com.example.appgym.Controlador.Responses.ClienteResponse
import com.example.appgym.Controlador.Responses.DefaultResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiServiceUsuarios {

    @Headers("Accept:application/json", "Content-Type:application/json")
    @GET("/")
    fun getListProductos(): Call<ClienteResponse>
    @POST("/add_dato")
    fun addProductos(@Body request: ClientesRequest): Call<DefaultResponse>
    /*@PUT("/update_dato/{id}")
    fun updateEmployee(@Path("id") id: Int, @Body request: ProductosRequest): Call<DefaultResponse>
    @DELETE("/delete_dato/{emp_id}")
    fun deleteEmployee(@Path("emp_id") emp_id: Int): Call<DefaultResponse>*/

}