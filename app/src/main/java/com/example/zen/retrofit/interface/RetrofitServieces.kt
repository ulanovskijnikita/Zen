package com.example.cinema.retrofit.`interface`

import com.example.cinema.retrofit.model.DataE
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServieces {
    @GET("feelings")
    fun getImage():Call<DataE>
}