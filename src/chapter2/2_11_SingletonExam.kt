package chapter2

/**
 * Created by Daniel on 2017-10-08.
 */


object SingletonClass {
    val str = "Hello World"

    fun sum(a:Int, b:Int):Int {
        return a+b
    }
}

fun main(args:Array<String>) {
    println(SingletonClass.str)

    val number = SingletonClass.sum(5, 10)
    println(number)
}