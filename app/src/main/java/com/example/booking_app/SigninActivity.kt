package com.example.booking_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
//        finding ids
        var progressbar=findViewById<ProgressBar>(R.id.progressbar)
        var username=findViewById<EditText>(R.id.username)
        var password=findViewById<EditText>(R.id.password)

//        button
        var signin=findViewById<Button>(R.id.signin)
        signin.setOnClickListener {
            var x= Intent(applicationContext,
                MainActivity::class.java)
            startActivity(x)
    }
//        find signup id
        var signup=findViewById<TextView>(R.id.signup)
        signup.setOnClickListener {
            var x=Intent(applicationContext,SignupActivity::class.java)
            startActivity(x)
        }

        //postman
}}