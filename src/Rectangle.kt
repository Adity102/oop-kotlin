class Rectangle(){
  var length: Double = 0.0
  var width: Double = 0.0
  fun area(){
    println("Area of ${length * width}")
  }
  fun perimeter(){
    println("Perimeter of ${2 * (length + width)}")
  }
}
fun main(){
  val rectangle = Rectangle()
  println("enter the Length:")
  rectangle.length = readln().toDouble()
  println("enter the width:")
  rectangle.width = readln().toDouble()
  rectangle.area()
  rectangle.perimeter()

}