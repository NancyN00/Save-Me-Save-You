package com.example.authenticationapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class DoctorsAdapter (private var dList: List<ViewDocs>) : RecyclerView.Adapter<DoctorsAdapter.DoctorsViewHolder>() {

    inner class  DoctorsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
              val logo : ImageView = itemView.findViewById(R.id.docIv)
              val docTv: TextView = itemView.findViewById(R.id.titleTv)
              val docDescTv : TextView = itemView.findViewById(R.id.docDesc)
               val constraintLayout : ConstraintLayout = itemView.findViewById(R.id.constraintLayout)

        fun collapseExpandedView(){
            docDescTv.visibility = View.GONE
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorsViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return DoctorsViewHolder(view)
    }

    fun setFilteredList(dList: List<ViewDocs>){
        this.dList = dList
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: DoctorsViewHolder, position: Int) {
             var docdata = dList[position]
             holder.logo.setImageResource(docdata.logo)
              holder.docTv.text = docdata.title
              holder.docDescTv.text = docdata.desc

        val isExpandable : Boolean = docdata.isExpandable
        holder.docDescTv.visibility = if(isExpandable) View.VISIBLE else View.GONE

        holder.constraintLayout.setOnClickListener {
             isAnyItemExpanded(position)
            docdata.isExpandable = !docdata.isExpandable
            notifyItemChanged(position, Unit)
        }
    }

    private fun isAnyItemExpanded(position: Int) {
        val temp = dList.indexOfFirst {
            it.isExpandable
        }

        if (temp >= 0 && temp != position){
            dList[temp].isExpandable= false
            notifyItemChanged(temp, 0)
        }
    }

    override fun onBindViewHolder(
        holder: DoctorsViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {

        if(payloads.isNotEmpty() && payloads[0] == 0){
            holder.collapseExpandedView()
        }else{
            super.onBindViewHolder(holder, position, payloads)
        }
    }

    override fun getItemCount(): Int {
                return dList.size

    }


}