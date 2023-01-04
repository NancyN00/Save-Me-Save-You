package com.example.authenticationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.authenticationapplication.R.id

class DoctorUpload : AppCompatActivity() {

    private lateinit var textv : TextView
    private lateinit var btnbtn : Button
    private lateinit var feldocbtn : Button
    private lateinit var combtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_upload)

        textv = findViewById(R.id.texone)
        btnbtn = findViewById(R.id.upbtn)
        feldocbtn = findViewById(R.id.btn_feldoc)
        combtn = findViewById(R.id.btn_com)


        btnbtn.setOnClickListener {
            Toast.makeText(this, "Verified", Toast.LENGTH_SHORT).show()
            var  i = Intent(this,ChatWithMe::class.java)
            startActivity(i)
        }

        feldocbtn.setOnClickListener {
            var  i = Intent(this,ViewFellowDoctors::class.java)
            startActivity(i)
        }

        combtn.setOnClickListener {
            Toast.makeText(this, "Welcome to the Family", Toast.LENGTH_SHORT).show()
            var  i = Intent(this,OurCommunityActivity::class.java)
            startActivity(i)
        }


    }
}