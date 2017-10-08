package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */

class RunTestClass {
    var number = 10

    fun sum(a:Int, b:Int):Int {
        return a+b
    }
}

fun main(args:Array<String>) {
    var testObj = RunTestClass()

    var num = testObj.run {
        number += 20

        sum(number, 20)
    }

    println(num)
}