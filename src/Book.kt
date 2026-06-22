class Book(
    var titel: String,
    var author: String,
    var price: Double
){fun display(){
        println(titel)
        println(author)
        println(price)
}
}
fun main(){
    val book1=Book("Kotlin","Adity",550.0)
    val book2=Book("JAVA","Dip",600.0)
    val book3=Book("Python","ZZp",400.0)
    val books = arrayOf(book1, book2, book3)
for (book in books  ) {
    if(book.price > 500){
        book.display()
    }
}
}




