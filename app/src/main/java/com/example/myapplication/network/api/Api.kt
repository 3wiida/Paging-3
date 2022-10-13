package com.example.myapplication.network.api

import com.example.myapplication.network.model.user.Result
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("")
    suspend fun fetchUsers(@Query("page") page: Int, @Query("results") results: Int):List<Result>
}