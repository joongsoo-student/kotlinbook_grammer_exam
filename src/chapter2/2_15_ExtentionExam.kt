package chapter2/*
class chapter2.Calculator {
    fun chapter2.sum(a:Int, b:Int):Int {
        return a+b
    }
}

fun chapter2.Calculator.chapter2.sum(a:Int, b:Int, c:Int):Int {
    return chapter2.sum(a, b) + c
}



fun chapter2.Calculator.chapter2.minus(a:Int, b:Int):Int {
    println("aaa")
    return a-b
}

fun chapter3.chapter2.chapter2.chapter2.main(args:Array<String>) {
    val calc = chapter2.Calculator()
    println(calc.chapter2.minus(10,2))
    println(calc.chapter2.sum(1,2,3))
}
*/