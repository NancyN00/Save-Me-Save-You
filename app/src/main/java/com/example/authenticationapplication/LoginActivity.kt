package com.example.authenticationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.authenticationapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var userneme: TextView
    private lateinit var userpass: TextView
    private lateinit var logologo: Button
    private lateinit var nocount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        userneme = findViewById(R.id.et_email)
        userpass = findViewById(R.id.et_password)
        nocount = findViewById(R.id.tv_havent_account)
        logologo = findViewById(R.id.btn_login)


        logologo.setOnClickListener {
            startActivity((Intent(this, ExploreActivity::class.java)))
        }

        nocount.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}