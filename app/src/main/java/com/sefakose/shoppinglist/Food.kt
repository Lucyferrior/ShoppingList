package com.sefakose.shoppinglist

class Food(Name:String, Price:Double, Weight: String): Item(Name, Price) {
    var weight: String //odevde string yazdığı için string belirledim. Ben olsam double yapardım

    init {
        weight = Weight
    }

    override fun toString(): String {
        return "$name: $$price ${weight}kg"
    }
}