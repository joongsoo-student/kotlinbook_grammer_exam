package chapter2/*
open class chapter2.Book {
    open fun readContent(page:Int) {}
}

abstract class EBook : chapter2.Book() {
    override abstract fun readContent(page: Int)
}
*/
