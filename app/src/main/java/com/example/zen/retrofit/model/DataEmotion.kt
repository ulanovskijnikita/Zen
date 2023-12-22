package com.example.cinema.retrofit.model

data class DataE(val success:Boolean, val data: List<DataEmotion>)
class DataEmotion(val title:String, val image:String)
