package com.example.zen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.cinema.retrofit.MyRetrofit
import com.example.cinema.retrofit.`interface`.RetrofitServieces
import com.example.cinema.retrofit.model.Data
import retrofit2.Call
import retrofit2.Response

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        //  Для Retrofit'а
        val emotionRes:RecyclerView = findViewById(R.id.recyclerEmotions)
        val retrofit = MyRetrofit().getRetrofit()
        val apiRet = retrofit.create(RetrofitServieces::class.java)
        val retCall:Call<Data> = apiRet.getImage()
        retCall.enqueue(object:retrofit2.Callback<Data> {
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                if (response.isSuccessful) {
                    emotionRes.adapter = response.body()?.let { EmotionsAdapter(applicationContext, it.data) }
                }
            }
            override fun onFailure(call: Call<Data>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })

//        //  Для data class'а
//        val RH:RecyclerView=findViewById(R.id.recyclerHorizontal)
//        RH.adapter = EmotionsAdapter(this, collection1().col1)

        val RV:RecyclerView = findViewById(R.id.recyclerVertical)
        RV.adapter=adapter2(this, collection2().col2)
    }

    fun reg(view: View) {
        val intent= Intent(this@MainActivity4, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}