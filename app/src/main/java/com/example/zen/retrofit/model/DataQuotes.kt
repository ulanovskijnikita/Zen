package com.example.zen.retrofit.model

data class DataQ(val success:Boolean, val data: List<DataQuotes>)
class DataQuotes(val title:String, val description:String, val image:String)
