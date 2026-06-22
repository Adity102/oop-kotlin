class ATM {
    private var balance:Double = 1000.0
    fun deposit(amount:Double){
        balance += amount
        println("Deposited: $amount")
    }
    fun withdraw(amount:Double){
        if(amount <= balance){
            balance -= amount
            println("Withdraw: $amount")
        }
        else{
            println("Insufficient balance")
        }
    }
    fun getBalance(){
        println("Balance = $balance")
    }
}
fun main(){
    val atm = ATM()
    atm.deposit(500.0)
    atm.withdraw(300.0)
    atm.getBalance()
}