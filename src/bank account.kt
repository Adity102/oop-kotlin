class BankAccount(){
    var accountHolder:String = ""
    var accountNumber:Int = 0
    var balance:Double = 0.0
    fun deposit(amount:Double){
        balance = balance + amount
        println("Deposit successful")
    }
    fun withdraw(amount:Double){
        if(amount > balance){
            println("Insufficient balance")
        }
        else{
            balance = balance - amount
            println("Withdraw successful")
        }
    }
    fun checkBalance(){
        println("Balance: $balance")
    }
}
fun main(){
    val account = BankAccount()
    account.accountHolder = "Adity"
    account.accountNumber = 101
    account.balance = 5000.0
    account.deposit(2000.0)
    account.withdraw(3000.0)
    account.checkBalance()
}