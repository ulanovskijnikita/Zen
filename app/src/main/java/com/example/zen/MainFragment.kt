package com.example.zen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zen.databinding.FragmentMainBinding
import com.example.zen.databinding.FragmentUserBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
            override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        return binding.root
//        Retrofit emotions
//        val emotionRes:RecyclerView = findViewById(R.id.recyclerEmotions)
//        val retrofitEmotions = MyRetrofit().getRetrofit()
//        val apiRet = retrofitEmotions.create(RetrofitServieces::class.java)
//        val retCall:Call<DataE> = apiRet.getImage()
//        retCall.enqueue(object:retrofit2.Callback<DataE> {
//            override fun onResponse(call: Call<DataE>, response: Response<DataE>) {
//                if (response.isSuccessful) {
//                    emotionRes.adapter = response.body()?.let { EmotionsAdapter(applicationContext, it.data) }
//                }
//            }
//            override fun onFailure(call: Call<DataE>, t: Throwable) {
//                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
//            }
//        })
//
//        //  Retrofit quotes
//        val quotesRes:RecyclerView = findViewById(R.id.recyclerVertical)
//        val retrofitQuotes = MyRetrofit().getRetrofit()
//        val apiQuotes = retrofitQuotes.create(Quotes::class.java)
//        val quotesCall:Call<DataQ> = apiQuotes.getQuotes()
//        quotesCall.enqueue(object:retrofit2.Callback<DataQ> {
//            override fun onResponse(call: Call<DataQ>, response: Response<DataQ>) {
//                if (response.isSuccessful) {
//                    quotesRes.adapter = response.body()?.let { adapter2(applicationContext, it.data) }
//                }
//            }
//            override fun onFailure(call: Call<DataQ>, t: Throwable) {
//                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
//            }
//        })
    }
}