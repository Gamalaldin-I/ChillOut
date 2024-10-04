package com.example.cillout

class GasIsland(private var salesQunatity:Double, private var LitrePrice:Double, private var groundPrice:Double){
    fun calculateTotalSalesPrice():Double{
        return salesQunatity * LitrePrice
    }
    fun calculateTotalGroundPrice():Double{
        return (salesQunatity/100) * groundPrice
    }
    fun calculateTotalSalesTax():Double{
        return calculateTotalSalesPrice()+calculateTotalGroundPrice()
    }

}