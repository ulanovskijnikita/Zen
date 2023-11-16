package com.example.cinema.retrofit.model

data class Data(val success:Boolean, val data: List<DataEmotion>)
data class DataEmotion(val id:String, val title:String, val image:String)
