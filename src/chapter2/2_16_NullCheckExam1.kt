package chapter2

fun main(args:Array<String>) {
    val number1:Int? = 0
    val number2:Int? = null

    println(number1?.toString())
    println(number2?.toString())
}
