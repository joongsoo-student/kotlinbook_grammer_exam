package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */


class WithTestClass {
    var number = 10

    fun sum(a:Int, b:Int):Int {
        return a+b
    }
}


fun main(args:Array<String>) {
    var testClass = WithTestClass()

    var num = with(testClass) {
        number = number + 10

        sum(10, number)
    }

    println(num)
}