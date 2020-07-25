class Customer(id: String, name: String, email: String, passWord: String) {

    fun createAccount(accountType: String, accountNumber: String, ownerName: String, dateCreated: String): BankAccount{
        println("Account created for $ownerName")
        return  BankAccount(accountType, accountNumber,ownerName, date = dateCreated)
    }


}