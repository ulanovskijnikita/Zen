package com.example.zen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.zen.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Icon
        val icons = listOf(R.drawable.image1, R.drawable.image2, R.drawable.image3)
        icons.shuffled()
        binding.imageUser.setImageResource(icons[0])

//        BottomNav
        binding.bottomNavigation.setOnItemReselectedListener {
            when(it.itemId) {
                R.id.user -> Toast.makeText(this, R.string.toast_here, Toast.LENGTH_LONG).show()
                R.id.main -> Intent(this, MainActivity4::class.java)
            }
        }
    }
}