class Employee(){
    var name:String = ""
    var basicSalary:Double = 0.0
    fun calculateBonus(){
        var bonus = basicSalary * 0.10
        println("Bonus: $bonus")
    }
    fun totalSalary(){
        var total = basicSalary + (basicSalary * 0.10)
        println("Total Salary: $total")
    }
}
fun main(){
    val emp = Employee()
    emp.name = "Adity"
    emp.basicSalary = 50000.0
    println("Name: ${emp.name}")
    emp.calculateBonus()
    emp.totalSalary()

}