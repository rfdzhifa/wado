package com.example.wado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val signup: TextView = findViewById(R.id.Signup)
        signup.setOnClickListener{ Signup() }

        val signinbutton: Button = findViewById(R.id.signin_button)
        signinbutton.setOnClickListener{ signin() }
    }

    private fun Signup() {
        val intent = Intent(this, Signup::class.java)
        startActivity(intent)
    }

    private fun signin() {
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }
}
