package com.example.appgym.Modelo.services

import android.content.Context
import com.example.appgym.Controlador.Util.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiGym {

    private lateinit var apiService: ApiServiceClientes

    fun getApiService(context: Context): ApiServiceClientes {
        if (!::apiService.isInitialized) {
            val retrofit = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okhttpClient(context))
                .build()
            apiService = retrofit.create(ApiServiceClientes::class.java)
        }
        return apiService
    }
    private fun okhttpClient(context: Context): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

}