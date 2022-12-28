package com.example.authenticationapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ChatWithMe : AppCompatActivity() {

    private lateinit var hi: TextView
    private lateinit var butncall: Button
    private lateinit var butnSms: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_with_me)

        hi = findViewById(R.id.txtView)
        butncall = findViewById(R.id.btnCall)
        butnSms = findViewById(R.id.btnSms)

        butncall.setOnClickListener {

            var phone = "+2540706231"
            var intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",
                phone, null))
            startActivity(intent)
            Toast.makeText(this, "I appreciate your call.", Toast.LENGTH_SHORT).show()

        }

        butnSms.setOnClickListener {

            val uri = Uri.parse("smsto:444333")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("Hello", "Tell me about your day.!")
            startActivity(intent)
            Toast.makeText(this, "thanks you for reaching out, I will get back to you.", Toast.LENGTH_SHORT).show()
        }
    }
}