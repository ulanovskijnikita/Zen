package com.example.zen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun sign_in(view: View) {
        val intent= Intent(this@MainActivity2, MainActivity3::class.java)
        startActivity(intent)
        finish()
    }

    fun reg(view: View) {
        val intent=Intent(this@MainActivity2, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}