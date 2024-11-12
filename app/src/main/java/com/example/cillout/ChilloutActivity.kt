package com.example.cillout

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cillout.databinding.ActivityChilloutBinding
import kotlinx.coroutines.delay

class ChilloutActivity : AppCompatActivity() {
    lateinit var binding: ActivityChilloutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChilloutBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        //delay(1000)
        setContentView(binding.root)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2500)

    }
}