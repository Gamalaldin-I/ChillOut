package com.example.cillout

import android.annotation.SuppressLint
import android.icu.util.Calendar
import java.text.SimpleDateFormat

object History {
    val historyArray= arrayListOf<HistoryDay>()
    @SuppressLint("SimpleDateFormat")
    fun getDate():String{
        val calender= Calendar.getInstance()!!
         val calenderFormat= android.icu.text.SimpleDateFormat("dd-MM-yyyy")
        val date=calenderFormat.format(calender)!!.toString()
        return date
    }
    fun addHistoyDay(shift:HistoryDay){
        historyArray.add(shift)
    }
    fun remove(possition:Int){
        historyArray.removeAt(possition)
    }
}