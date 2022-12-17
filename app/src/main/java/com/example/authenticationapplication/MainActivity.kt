package com.example.authenticationapplication

import android.app.ActivityManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.authenticationapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var hel: TextView
    private lateinit var nice: TextView
    private lateinit var logino: Button
    private lateinit var regino: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hel = findViewById(R.id.tv_started_title)
        nice = findViewById(R.id.tv_started_sub_title)
        logino = findViewById(R.id.btn_login)
        regino = findViewById(R.id.btn_register)

        logino.setOnClickListener {
            var i = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }

        regino.setOnClickListener {
            var i = Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }
    }
}