package chapter2/*
interface Parent {
    val str:String

    fun myMethod()
}

class chapter2.Child:Parent {
    override val str = "chapter2.Child"

    override fun myMethod() {
        // chapter2.Child Override
    }
}
        */