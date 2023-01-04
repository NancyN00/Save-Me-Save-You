package com.example.authenticationapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ExploreActivity : AppCompatActivity() {

    private lateinit var hel: TextView
    private lateinit var nice: TextView
    private lateinit var logino: Button
    private lateinit var regino: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        hel = findViewById(R.id.tv_started_title)
        nice = findViewById(R.id.tv_started_sub_title)
        logino = findViewById(R.id.btn_login)
        regino = findViewById(R.id.btn_register)

        logino.setOnClickListener {
            var i = Intent(this, ReccomendedActivity::class.java)
            startActivity(i)

        }

        regino.setOnClickListener {
            var i = Intent(this, DoctorUpload::class.java)
            startActivity(i)
        }
    }
}