package com.example.booking_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        var username=findViewById<EditText>(R.id.username)
        var email =findViewById<EditText>(R.id.email)
        var phone =findViewById<EditText>(R.id.phone)
        var password =findViewById<EditText>(R.id.password)
        var confirm_password =findViewById<EditText>(R.id.confirm_password)

//        prgressbar
        var progressbar =findViewById<ProgressBar>(R.id.progressbar)
        progressbar.visibility=View.GONE
//        signup button
        var signup =findViewById<Button>(R.id.signup)
        signup.setOnClickListener {
            var x=Intent(applicationContext,
                SigninActivity::class.java)
            startActivity(x)
        }
        var signin=findViewById<TextView>(R.id.login)
        signin.setOnClickListener {
            var x=Intent(applicationContext,SigninActivity::class.java)
            startActivity(x)
        }

//create a dabasabe called booking_db

    }
}