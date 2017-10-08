package chapter2

/**
 * Created by Daniel on 2017-10-07.
 */

fun main(args:Array<String>) {
    val num1:Int? = null
    val num2:Int? = 10

    val str1 = num1?.toString() ?: "Hello!"
    val str2 = num2?.toString() ?: "World!"

    println("$str1 $str2")
}