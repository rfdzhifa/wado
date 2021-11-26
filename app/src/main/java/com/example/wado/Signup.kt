package com.example.wado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val signin: TextView = findViewById(R.id.Signin)
        signin.setOnClickListener{ SignIn() }

        val signupbotton: Button = findViewById(R.id.signup_button)
        signupbotton.setOnClickListener { Signup() }
    }

    private fun SignIn() {
        val intent = Intent(this, Signup::class.java)
        startActivity(intent)
    }

    private fun Signup() {
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }
}