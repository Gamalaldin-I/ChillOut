package com.example.cillout

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cillout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
<<<<<<< HEAD
    @SuppressLint("ResourceAsColor")
=======
    @SuppressLint("ResourceAsColor", "SetTextI18n")
>>>>>>> 4615546 (this is the first commit)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
            var totalProfit=0.0
            binding.calculateBtn.setOnClickListener {
                //
                try {

                var wared=binding.wared.text.toString().toDouble()
                val ohda=binding.ohda.text.toString().toDouble()
                var fiza=binding.fiza.text.toString().toDouble()
                val faka=binding.faka.text.toString().toDouble()
                val extra=(binding.extra.text.toString()).toDouble()
                val percentage=binding.overPercentage.text.toString().toDouble()
                //island
                val salesQ=binding.salesQuantity.text.toString().toDouble()
                val litrePrice=binding.priceOfLitre.text.toString().toDouble()
                val groundPrice=binding.ground.text.toString().toDouble()
                //calculate
                val shift=Shift(wared,ohda,fiza,faka,extra,percentage)
                val island=GasIsland(salesQ,litrePrice,groundPrice)
                val revenue=shift.totalRevenue()
                val totalGasQPrice=island.calculateTotalSalesPrice()
                val totalGroundPrice=island.calculateTotalGroundPrice()
                val totalCost=island.calculateTotalSalesTax()
                val totalRemaining=shift.remaining(totalCost)
                    totalProfit=shift.profit(totalCost)
                //display
                binding.totalRevenue.text=revenue.toString()
                binding.totalSalesQuantityPrice.text=totalGasQPrice.toString()
                binding.totalGroundPrice.text=totalGroundPrice.toString()
                binding.remainingRevenue.text=totalRemaining.toString()
                if(totalProfit>0){
                    binding.overOrUnder.text=totalProfit.toString()
                    binding.overOrUnder.setTextColor(getColor(R.color.Green))
                }
                else{
                    totalProfit=totalRemaining
<<<<<<< HEAD
                    binding.overOrUnder.text="Sorry you are under good luck tommorow"
=======
                    binding.overOrUnder.text="Sorry you are underfetting good luck tommorow"
>>>>>>> 4615546 (this is the first commit)
                    binding.overOrUnder.setTextColor(getColor(R.color.Red))
                }}
                catch (e:Exception){
                    Toast.makeText(this, "Please enter valid values", Toast.LENGTH_SHORT).show()
                }
            }
            binding.resetBtn.setOnClickListener{
                //clear
                binding.wared.text.clear()
                binding.ohda.text.clear()
                binding.fiza.text.clear()
                binding.faka.text.clear()
                binding.extra.text.clear()
                binding.salesQuantity.text.clear()
            }
           binding.save.setOnClickListener{
               val shiftOver=HistoryDay(1,History.getDate(),totalProfit)
               History.addHistoyDay(shiftOver)
               Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show()
           }
        binding.history.setOnClickListener{
            startActivity(Intent(this,HistoryActivity::class.java))
        }



        setContentView(binding.root)

    }
}