package com.example.cillout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cillout.databinding.HistoryCardBinding

class HistoryAdabter(private val data: ArrayList<HistoryDay>) :
    RecyclerView.Adapter<HistoryAdabter.HistoryDayHolder>() {

    // Create ViewHolder class
    class HistoryDayHolder(val binding: HistoryCardBinding) : RecyclerView.ViewHolder(binding.root)

    // Create ViewHolder and inflate the item layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryDayHolder {
        val binding = HistoryCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HistoryDayHolder(binding)
    }

    // Bind data to the ViewHolder
    override fun onBindViewHolder(holder: HistoryDayHolder, position: Int) {
        holder.binding.id.text=data[position].id.toString()
        holder.binding.dateOfDay.text=data[position].data
        holder.binding.overOr.text=data[position].overOrUnder.toString()
        if(data[position].overOrUnder>0){
            holder.binding.imgD.setImageResource(R.color.Green)
        }else holder.binding.imgD.setImageResource(R.color.Red)

    }

    // Return the size of the data list
    override fun getItemCount(): Int {
        return data.size
    }
}