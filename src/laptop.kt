class Laptop(var ram:Int){
    var ssd: Int=0
    constructor(ram:Int,ssd: Int):this(ram){
        this.ssd=ssd
    }
    fun display(){
        println("my laptop ram=$ram GB")
        println("my laptop ssd=$ssd ")
    }
}
fun main(){
    val pc=Laptop(8,556)
    pc.display()
}