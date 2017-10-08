package chapter2

/**
 * Created by Daniel on 2017-08-29.
 */


fun main(args: Array<String>) {
    println(function1(0))
}

fun function1(num1:Int):Int {
    fun function2(num2:Int):Int {
        fun function3(num3:Int):Int {
            return num3 + 1
        }
        return function3(num2) + 1
    }
    return function2(num1) + 1
}