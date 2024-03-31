package com.sefakose.shoppinglist

abstract class Item(Name: String, Price: Double){
    var name: String
    var price: Double
    init {
        name = Name
        price = Price
    }

    abstract override fun toString(): String
}

