package com.example.cillout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cillout.databinding.ActivityHistoryBinding
import com.example.cillout.databinding.ActivityMainBinding

class HistoryActivity : AppCompatActivity() {
    lateinit var binding: ActivityHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityHistoryBinding.inflate(layoutInflater)
        binding.historyRecycler.adapter=HistoryAdabter(History.historyArray)
        setContentView(binding.root)


    }
}