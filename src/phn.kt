class Mobile(var brand:String,var price:Double){
    fun display(){
        println("Brand=$brand")
        println("Price= $price")
    }
}
fun main(){
    val p1=Mobile("Samsung",500.00)
    var p2 = Mobile("iPhone", 80000.0)
    p1.display()
    p2.display()
}
