package com.sefakose.shoppinglist

class Cloth(Name:String, Price:Double, Type:String): Item(Name, Price){
    var type: String

    init {
        type = Type
    }

    override fun toString(): String {
        return "$name: $$price $type"
    }
}