package com.example.authenticationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MyStoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_story)

        val headingNews : TextView = findViewById(R.id.heading)
        val mainNews : TextView = findViewById(R.id.news)
        val imageNews : ImageView = findViewById(R.id.image_heading)
        val talk : Button = findViewById(R.id.talk)

        talk.setOnClickListener {
            Toast.makeText(this, "thank you for checking us out", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, ChatWithMe::class.java))
        }
        val bundle : Bundle?= intent.extras
        val heading = bundle!!.getString("heading")
        val imageId = bundle.getInt("imageId")
        val news = bundle.getString("news")

        headingNews.text = heading
        mainNews.text = news
        imageNews.setImageResource(imageId)

    }
}