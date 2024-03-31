package com.sefakose.shoppinglist

class ShoppingList{
    private val list: ArrayList<Item>

    init{
        list = arrayListOf<Item>()
        list.add(Food("deneme", 12.0, "11"))
        list.add(Food("deneme", 12.0, "11"))
    }

    fun addItem(item: Item){
        list.add(item)
    }

    fun displayItems(){
        list.forEachIndexed { index, item ->
            println("${index+1}. $item")
        }
    }

    fun deleteItem(index: Int){
        list.removeAt(index)
    }

}