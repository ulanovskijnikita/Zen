package com.example.zen

data class dataClass(val Img:Int, val Text:String)
class collection1 {
    val col1= listOf(dataClass(R.drawable.image1, "спокойным"),
        dataClass(R.drawable.image2, "Расслабленным"),
        dataClass(R.drawable.image3, "Задумчивым"),
        dataClass(R.drawable.image1, "Взволнованным"))
}
