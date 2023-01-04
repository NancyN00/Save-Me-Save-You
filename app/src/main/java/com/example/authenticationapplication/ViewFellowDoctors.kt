package com.example.authenticationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class ViewFellowDoctors : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var searchView : SearchView
    private var dList = ArrayList<ViewDocs>()
    private lateinit var adapter: DoctorsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_fellow_doctors)

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        addDataToList()
            adapter = DoctorsAdapter(dList)
            recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object  :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterlist(newText)
                return true
            }

        })

    }

    private fun filterlist(query : String?){
        if (query != null){
            val filteredList = ArrayList<ViewDocs>()
            for (i in dList){
                if (i.title.toLowerCase(Locale.ROOT).contains(query)){
                    filteredList.add(i)
                }
            }
            if (filteredList.isEmpty()){
                Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show()
            }
            else{
                adapter.setFilteredList(filteredList)
            }
        }
    }

    private fun addDataToList(){
        dList.add(ViewDocs("Doctor Ancy",
            R.drawable.doctor_one,
            "What motivated me to Psychology, wasn’t the actual intention of being what people stereotyped as a couch therapist. My goal was to gain the knowledge, the comprehension and the understanding of the behavior of the human condition.\n" +
                "It was not about fixing or treating mental health issues, it certainly was not about making a name for myself, and definitely not about making a fortune. Psychology is not just taking one major and then cutting teeth on a profession. I spent more than 20 years in the academic studies in four different universities and four different countries. It wasn’t just Psychology, it was Philosophy, It was Social Anthropology, it was Biology, it was Neurological Sciences, it was studying cultures, societies, traditions, belief systems, and the patterns of behavior that rippled out from each and every aspect.\n"))
        dList.add(ViewDocs("Doctor Yennifer",
            R.drawable.doctor_two, "After starting my own fitness journey over the summer of 2014 (between first and second year), my love for fitness, health and general wellbeing grew. The incredible way in which looking after yourself can make you feel good on the inside and outside transformed my outlook and has helped me become who I am today (as cringe as that sounds). Even though fitness and living a healthy lifestyle can be a rollercoaster and some days you really fancy a big slab of chocolate cake, these are my ten reasons why I became a PT…"))
        dList.add(ViewDocs("Doctor Ricky",
            R.drawable.doctor_three, "When a patient gets well his doctor 'feels' good–a personal warm glow that tells him once again what being a doctor is. This pleasure never dulls with age or time, but remains vital and strong after decades of practice. 'Becoming a doctor' is acquiring this ability to help a sick person get better. It is one of the most precious skills one can acquire in a lifetime.\""))
        dList.add(ViewDocs("Doctor Kimmie Kiddie",
            R.drawable.doctor_four,
            "I always loved the sciences in school, and was specifically intrigued by the scientific process of wondering, questioning, and then trying to prove/disprove a theory. Taking my own intellectual curiosity and using it to put the clues together to figure out what is happening with a child, or how to best help them and their family is a wonderful puzzle that I thoroughly enjoy. Plus, getting paid in wilted flowers, colored pictures, chocolate handprints and heartfelt hugs kindles the spirit in a way that a firm handshake never can."))
        dList.add(ViewDocs("Doctor We",
            R.drawable.doctor_five,
            "As a nurse, I have a flexible career that allows me to pursue my passions while also having a significant positive impact on patients at need. I was initially attracted to the nursing profession as I loved working with the elderly and had a strong interest in human physiology. There were flexible nursing programs in my local area that were affordably priced, so it was easy for me to start my RN program. I was also very excited by the opportunities to obtain advanced practice certifications and licenses through distanced-based programs that were flexible and could work around my personal commitments."))
        dList.add(ViewDocs("Doctor Ancy",
            R.drawable.doctor_six,
            "What motivated me to Psychology, wasn’t the actual intention of being what people stereotyped as a couch therapist. My goal was to gain the knowledge, the comprehension and the understanding of the behavior of the human condition."))
        dList.add(ViewDocs("Doctor Yennifer",
            R.drawable.doctor_seven,
            "After starting my own fitness journey over the summer of 2014 (between first and second year), my love for fitness, health and general wellbeing grew. The incredible way in which looking after yourself can make you feel good on the inside and outside transformed my outlook and has helped me become who I am today (as cringe as that sounds). Even though fitness and living a healthy lifestyle can be a rollercoaster and some days you really fancy a big slab of chocolate cake, these are my ten reasons why I became a PT…"))
        dList.add(ViewDocs("Doctor Ricky",
            R.drawable.doctor_eight, "I always loved the sciences in school, and was specifically intrigued by the scientific process of wondering, questioning, and then trying to prove/disprove a theory. Taking my own intellectual curiosity and using it to put the clues together to figure out what is happening with a child, or how to best help them and their family is a wonderful puzzle that I thoroughly enjoy. Plus, getting paid in wilted flowers, colored pictures, chocolate handprints and heartfelt hugs kindles the spirit in a way that a firm handshake never can."))
    }
}