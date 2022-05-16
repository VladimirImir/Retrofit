package com.example.retrofit.data.repository

import com.example.retrofit.data.api.RetrofitInstance
import com.example.retrofit.model.beznal.Beznal
import com.example.retrofit.model.nal.Nalichka
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal(): Response<Beznal>{
        return RetrofitInstance.api.getBeznalMoneys()
    }
}