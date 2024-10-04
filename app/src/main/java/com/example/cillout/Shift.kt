package com.example.cillout

class Shift(var wared:Double=0.0, var fiza:Double=0.0, var ohda:Double=0.0, var faka:Double=0.0, var extra:Double=0.0,var percentag:Double=0.0) {
    fun totalRevenue():Double{
        return wared+fiza+ohda+faka+extra
    }
    fun remaining(totalCosts:Double ):Double{
       return (totalRevenue()-totalCosts)
    }
    fun profit(totalCosts:Double):Double{
        val profit=(remaining(totalCosts)*percentag)/100
        return if (profit<0){
            0.0
        }else{
            profit
        }
    }

}