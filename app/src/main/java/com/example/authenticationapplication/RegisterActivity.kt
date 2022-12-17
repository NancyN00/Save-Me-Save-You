package com.example.authenticationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.authenticationapplication.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {
    private lateinit var fulname: TextView
    private lateinit var email: TextView
    private lateinit var usname: TextView
    private lateinit var pass: TextView
    private lateinit var regreg: Button
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        fulname = findViewById(R.id.et_fullname)
        email = findViewById(R.id.et_email)
        usname = findViewById(R.id.et_username)
        pass = findViewById(R.id.et_password)
        regreg = findViewById(R.id.btn_register)

        auth = Firebase.auth

        regreg.setOnClickListener {
            var ufulname = fulname.text.toString().trim()
            var useremail = email.text.toString().trim()
            var usersname = usname.text.toString().trim()
            var userpass = regreg.text.toString().trim()

            auth.createUserWithEmailAndPassword(useremail, userpass).addOnCompleteListener {
                if (it.isSuccessful) {

                    Toast.makeText(this, "Account Registered", Toast.LENGTH_SHORT).show()
                    Log.d("Succ--->", it.toString())

                } else {

                    Toast.makeText(this, "Failed, try again!", Toast.LENGTH_LONG).show()
                    Log.d("Failed--->", it.toString())


                }
            }
        }

    }
}