package com.example.authenticationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.authenticationapplication.databinding.ActivityBeginBinding

class BeginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBeginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityBeginBinding.inflate(layoutInflater)
        setContentView(binding.root)

         binding.btnBegin.setOnClickListener {
             startActivity(Intent(this, MainActivity::class.java))
         }
    }
}