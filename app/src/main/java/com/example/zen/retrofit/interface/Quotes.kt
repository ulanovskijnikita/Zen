package com.example.zen.retrofit.`interface`

import com.example.cinema.retrofit.model.DataE
import com.example.zen.retrofit.model.DataQ
import retrofit2.Call
import retrofit2.http.GET

interface Quotes {
        @GET("quotes")
        fun getQuotes(): Call<DataQ>
}