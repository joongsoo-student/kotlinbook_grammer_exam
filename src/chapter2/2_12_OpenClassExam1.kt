package chapter2/*
fun chapter3.chapter2.chapter2.chapter2.main(args: Array<String>) {
    val book = chapter2.Book("Kotlin", "Daniel")
    val ebook = EBook("Kotlin", "Daniel", "https://devdogs.kr")

    book.printInfo()
    ebook.printInfo()
}

open class chapter2.Book() {
    var title:String = ""
    var author:String = ""

    constructor(title:String) : this() {
        this.title = title
    }

    constructor(title:String, author: String) : this(title) {
        this.author = author
    }

    open fun printInfo() {
        println("제목은 ${title}, 저자는 ${author} 입니다.")
    }
}

class EBook(title:String, author: String, var url:String?) : chapter2.Book(title, author) {

    constructor() : this("", "", null)

    override fun printInfo() {
        println("제목은 ${title}, 저자는 ${author}, 접속 URL은 ${url} 입니다.")
    }
}
        */