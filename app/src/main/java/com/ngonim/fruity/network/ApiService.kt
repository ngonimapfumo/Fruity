package com.ngonim.fruity.network

import com.ngonim.fruity.network.response.GetAllFruitResponse
import com.ngonim.fruity.network.response.GetFruitResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("all")
    suspend fun getAllFruits(): Response<GetAllFruitResponse>

    @GET("{id}")
    suspend fun getFruit(@Path("id") id: Int): Response<GetFruitResponse>

}