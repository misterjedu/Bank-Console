import java.util.*

fun main() {
    var gtbank = createBank("GtBank")
    createNewCustomer("GtBank", "Oladokun Oladapo", "oladokun104@gmail.com", "1234")

    createNewAccount("GtBank", "Oladokun Oladapo", "Savings", "0023455","00234=-23-01-2020")

}

//    Create a new Bank
fun createBank(bankName: String): Bank {
    var newBank = Bank(bankName)
    listOfBanks[bankName] = newBank
    println("New bank, $bankName successfully created")
    return newBank
}

// Create a new Customer
fun createNewCustomer(bankName: String, customerName: String, customerEmail: String, customerPassword: String): Customer {
    var bankAddress: Bank
    var id = UUID.randomUUID().toString()
    return if (listOfBanks[bankName] == null) {
        println("The bank $bankName does not exist.")
        throw IllegalArgumentException("The bank $bankName does not exist.")
    } else {
        bankAddress = listOfBanks[bankName]!!
        var newCustomer = bankAddress.createCustomer(id, customerName, customerEmail, bankName, customerPassword)
        oneCustomer = newCustomer
        newCustomer
    }
}

fun createNewAccount(bankName: String, customerName: String, accountType: String, accountNumber: String , date: String){
        oneCustomer.createAccount(accountType, accountNumber, customerName, date )
}

// Print all customers
fun allCustomerDetails (){

}



// Store Banks
var listOfBanks = mutableMapOf<String, Bank>()

// Store Customers of a bank
var listOfCustomer = mutableListOf<String>()

lateinit var oneCustomer: Customer

// Store all Customer details
//var allCustomeDetails = mutableMapOf<String,  >()