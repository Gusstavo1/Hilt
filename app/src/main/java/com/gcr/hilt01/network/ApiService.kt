package com.gcr.hilt01.network

import com.gcr.hilt01.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("todos")
    fun getData(): Call<List<UserResponse>>
}