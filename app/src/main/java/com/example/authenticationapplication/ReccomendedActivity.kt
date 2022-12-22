package com.example.authenticationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView.FindListener
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class ReccomendedActivity : AppCompatActivity() {

    private lateinit var newRecyclerview : RecyclerView
    private lateinit var newArrayList : ArrayList<doctors>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var news : Array<String>


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
        //create a string and use its name inside the getString
        news = arrayOf(
                         getString(R.string.story_one),
                         getString(R.string.story_two),
                         getString(R.string.story_three),
                         getString(R.string.story_four),
                         getString(R.string.story_five),
                         getString(R.string.story_six),
                         getString(R.string.story_seven),
                         getString(R.string.story_eight),
                         getString(R.string.story_nine)
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

         var adapter = MyAdapter(newArrayList)
        newRecyclerview.adapter = adapter
        adapter.setOnItemClicklistener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@ReccomendedActivity, "Thank You!," +
                   "$position", Toast.LENGTH_SHORT).show()

                val intent = Intent(this@ReccomendedActivity,MyStoryActivity::class.java)
                intent.putExtra("heading",newArrayList[position].heading)
                intent.putExtra("imageId",newArrayList[position].heading)
                intent.putExtra("news",news[position])
                startActivity(intent)
            }

        })
    }
}