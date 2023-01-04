package com.example.authenticationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.authenticationapplication.R.id.parentRecyclerView

class OurCommunityActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private val parentList = ArrayList<ParentItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_our_community)

        recyclerView = findViewById(R.id.parentRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        val adapter = ParentAdapter(parentList)
        recyclerView.adapter = adapter
    }

    private fun addDataToList(){
        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("Depression", R.drawable.depression))
        childItems1.add(ChildItem("Suicide", R.drawable.nineoneone))
        childItems1.add(ChildItem("Fire", R.drawable.fire))

        parentList.add(ParentItem("Who To Call", R.drawable.nineoneone, childItems1))

        val childItems2 = ArrayList<ChildItem>()
        childItems2.add(ChildItem("Write For Us", R.drawable.write_us))
        childItems2.add(ChildItem("Write With Others", R.drawable.write))
        childItems2.add(ChildItem("Read", R.drawable.read))

        parentList.add(ParentItem("Blogs", R.drawable.write_us, childItems2))

        val childItems3 = ArrayList<ChildItem>()
        childItems3.add(ChildItem("Patient", R.drawable.happypatient))
        childItems3.add(ChildItem("Doctor", R.drawable.happydoctor))
        childItems3.add(ChildItem("Anonymous", R.drawable.anon))

        parentList.add(ParentItem("Testimony", R.drawable.happypatient, childItems3))


        val childItems4 = ArrayList<ChildItem>()
        childItems4.add(ChildItem("Jogging", R.drawable.jog))
        childItems4.add(ChildItem("Watch Sunset", R.drawable.sunset))
        childItems4.add(ChildItem("Practice Mindfulness", R.drawable.yoga))

        parentList.add(ParentItem("Excersise and Practicing Mindfulness", R.drawable.excercise, childItems4))


        val childItems5 = ArrayList<ChildItem>()
        childItems5.add(ChildItem("Are You A Student?", R.drawable.student))
        childItems5.add(ChildItem("Switching Careers?", R.drawable.couch))
        childItems5.add(ChildItem("Invest In Your Talents", R.drawable.talents))

        parentList.add(ParentItem("Career", R.drawable.car, childItems5))
    }
}