package com.example.zen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.cinema.retrofit.MyRetrofit
import com.example.cinema.retrofit.`interface`.RetrofitServieces
import com.example.cinema.retrofit.model.DataE
import com.example.zen.databinding.ActivityMain4Binding
import com.example.zen.retrofit.`interface`.Quotes
import com.example.zen.retrofit.model.DataQ
import retrofit2.Call
import retrofit2.Response

class MainActivity4 : AppCompatActivity() {
    private val fragmentList = listOf(UserFragment(), MainFragment())

    private lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        Fragments
        val fragmentAdapter = MainActivity4Adapter(this, fragmentList)
        binding.viewPager.adapter = fragmentAdapter

//        BottomNav
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.user -> {
                    binding.viewPager.currentItem = 0
                    true
                }
                R.id.main -> {
                    binding.viewPager.currentItem = 1
                    true
                }

                else -> true}
            }
        }
}



