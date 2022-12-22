package com.example.authenticationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView.FindListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReccomendedActivity : AppCompatActivity() {

    private lateinit var newRecyclerview : RecyclerView
    private lateinit var newArrayList : ArrayList<doctors>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reccomended)

        imageId = arrayOf(

            R.drawable.doctor_one,
            R.drawable.doctor_two,
            R.drawable.doctor_three,
            R.drawable.doctor_four,
            R.drawable.doctor_five,
            R.drawable.doctor_six,
            R.drawable.doctor_seven,
            R.drawable.doctor_eight
        )

        heading = arrayOf(
           "Doctor Ancy",
            "Doctor Yennifer",
            "Doctor Ricky",
            "Doctor Kimmie Kiddie",
            "Doctor We",
            "Doctor Ancy",
            "Doctor Yennifer",
            "Doctor Ricky",
            "Doctor Kimmie Kiddie"
        )

        newRecyclerview = findViewById(R.id.recyclerView)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)

        newArrayList = arrayListOf<doctors>()
        getUserdata()
    }

    private fun getUserdata() {

        for  (i in imageId.indices){
            val doctors  = doctors(imageId[i], heading[i])
            newArrayList.add(doctors)
        }

        newRecyclerview.adapter = MyAdapter(newArrayList)
    }
}