class Bank( name: String) {

    fun createCustomer(id: String, name: String, email: String, bankName: String, passWord: String): Customer{
       var newCustomer = Customer(id = id, name = name, email = email, passWord = passWord)
        println("$name became a customer in $bankName")
        return  newCustomer
    }

}