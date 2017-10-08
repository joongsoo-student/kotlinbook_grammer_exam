package chapter2

/**
 * Created by Daniel on 2017-09-15.
 */


fun main(args: Array<String>) {
    val calc = Calc()
    println(calc.sum(1, 5))
}

class Calc {
    fun sum(a:Int, b:Int):Int {
        return a+b
    }
}