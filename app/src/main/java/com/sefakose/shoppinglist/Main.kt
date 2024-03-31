import com.sefakose.shoppinglist.Cloth
import com.sefakose.shoppinglist.Food
import com.sefakose.shoppinglist.Item
import com.sefakose.shoppinglist.ShoppingList
import java.io.Console

lateinit var shoppingList : ShoppingList
fun main() {
    shoppingList = ShoppingList()
    var choice: Int?
    while (true) {

        println("1- Add Item")
        println("2- Display Item")
        println("3- DeleteItem")
        println("4- Exit")

        print("Select an option: ")
        choice = readln().toIntOrNull()
        println()
        when (choice) {
            1 -> addMenuOption()
            2 -> displayMenuOption()
            3 -> deleteMenuOption()
            4 -> break
            else -> {
                println("Hatalı işlem yeniden dene.")
                continue
            }
        }

        println("*************************************")
    }
}

fun deleteMenuOption(){
    println("Enter the item number you want to delete: ")
    print("Item number: ")
    var deleteIndex: Int? = readln().toIntOrNull()

    while (deleteIndex == null) {
        println("\n" + "Please enter a valid item number!")
        print("Item number: ")
        deleteIndex = readln().toIntOrNull()
    }

    shoppingList.deleteItem(deleteIndex-1)
}

fun displayMenuOption(){
    shoppingList.displayItems()
}

fun addMenuOption(){
    println("1- Food")
    println("2- Cloth")
    println("0- Go Back")
    var addChoice:Int?

    print("Select an option: ")
    addChoice = readln().toIntOrNull()
    while (true){


        when(addChoice){
            1-> shoppingList.addItem(getFoodFromUser())
            2-> shoppingList.addItem(getClothFromUser())
            0-> break
            else->{
                println("Select a valid option! ")
                print("Option: ")
                addChoice = readln().toIntOrNull()
                continue
            }
        }
        break
    }

}

fun getClothFromUser(): Item {
    val name: String
    var price: Double?
    val type: String

    print("Name: ")
    name = readln()
    print("Price: ")
    price = readln().toDoubleOrNull()

    while (price == null) {
        println("Please enter a valid price!")
        print("Price: ")
        price = readln().toDoubleOrNull()
    }

    print("Type: ")
    type = readln().toString()

    return Cloth(name, price, type)
}

fun getFoodFromUser(): Item {
    val name: String
    var price: Double?
    var weight: Double?

    print("Name: ")
    name = readln()
    print("Price: ")
    price = readln().toDoubleOrNull()

    while (price == null) {
        println("Please enter a valid price!")
        print("Price: ")
        price = readln().toDoubleOrNull()
    }

    print("Weight: ")
    weight = readln().toDoubleOrNull()

    while (weight == null) {
        println("Please enter a valid weight!")
        print("Weight: ")
        weight = readln().toDoubleOrNull()
    }
    return Food(name, price, weight.toString())
}
