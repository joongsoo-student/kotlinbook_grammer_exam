package chapter2


/*
fun main(args: Array<String>) {
    val book = Book("Kotlin", "Daniel")
    val ebook = EBook("Kotlin", "Daniel", "https://devdogs.kr")

    book.printInfo()
    ebook.printInfo()
}

open class Book() {
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

open class EBook : Book {
    var url:String = ""

    constructor() : super("", "")

    constructor(title:String, author: String, url:String) : super(title, author) {
        this.url = url
    }

    final override fun printInfo() {
        println("제목은 ${title}, 저자는 ${author}, 접속 URL은 ${url} 입니다.")
    }
}

class ExtendEbook() : EBook() {
    val a:String?
    get() {
        return a
    }
}
        */