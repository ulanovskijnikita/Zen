package com.example.zen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class MainActivity3 : AppCompatActivity() {
    lateinit var mail:EditText
    lateinit var pass:EditText

    val pattern=("[1-100a-z]{1,100}" + "@" + "[a-z1-100]{1,100}" + "\\." + "[a-z]{1,3}")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        mail=findViewById(R.id.editTextTextEmailAddress)
        pass=findViewById(R.id.editTextTextPassword)
    }

    fun emailValid(text:String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()}

    fun finish(view: View) {
        if(mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty()){
            if(emailValid(mail.text.toString())){
                val intent= Intent(this@MainActivity3, MainActivity4::class.java)
                startActivity(intent)
                finish()}
            else {Toast.makeText(this,"почта заполнена не верно", Toast.LENGTH_LONG).show()}
        }
        else {
            Toast.makeText(this,"поля пусты", Toast.LENGTH_LONG).show()
        }
    }

    fun reg(view: View) {
        val intent=Intent(this@MainActivity3, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}