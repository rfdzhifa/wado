package com.example.wado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.TextView

class Home : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.home)

                supportActionBar?.hide()
                window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

                val addtask : TextView = findViewById(R.id.addTask)
                addtask.setOnClickListener{ AddTask() }
        }

        private fun AddTask() {
                val intent = Intent(this, CreateTaskFragment::class.java)
                startActivity(intent)
        }
}