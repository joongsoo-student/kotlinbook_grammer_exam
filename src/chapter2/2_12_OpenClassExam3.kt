package chapter2/*
open class chapter2.Book() {
    open val serialNumber = 5555
    open var price = 1000
}

class EBook : chapter2.Book() {
    override val serialNumber = 7777
    override var price = 5000
}
*/