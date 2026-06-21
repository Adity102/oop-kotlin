class Student(){
    var name:String="Adity"
    var id:Int=5
    var department:String="CSE"

    fun display(){
        println("my name=$name")
        println("my id=$id")
        println("my department=$department")

    }
}

fun main(){
    val student=Student()
    student.display()
}