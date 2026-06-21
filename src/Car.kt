class Car(){
    var brand:String=""
    var model:String=""
    var year:Int=0
    fun sratcar(){
        println("$brand car is started")
    }
    fun stopcar(){
        println("$brand car is stopped")
    }
}
fun main(){
    var car1 = Car()

    car1.brand="Toyota"
    car1.model="Corolla"
    car1.year=2024

    var car2=Car()
    car2.brand="BMW"
    car2.model="X5"
    car2.year=2025

    println(car1.brand)
    println(car1.model)
    println(car1.year)

    car1.sratcar()
    car1.stopcar()

    println(car2.brand)
    println(car2.model)
    println(car2.year)
    car2.sratcar()
    car2.stopcar()
}

