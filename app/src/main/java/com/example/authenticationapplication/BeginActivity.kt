package com.example.authenticationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.authenticationapplication.databinding.ActivityBeginBinding

class BeginActivity : AppCompatActivity() {
    private lateinit var bege : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin)

             bege = findViewById(R.id.btn_begin)
         bege.setOnClickListener {
             startActivity(Intent(this, MainActivity::class.java))
         }
    }
}