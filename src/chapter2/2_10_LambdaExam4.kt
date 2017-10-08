package chapter2

/**
 * Created by Daniel on 2017-08-30.
 */



fun minus(a:Int, b:Int):Int {
    return a-b
}

fun main(args: Array<String>) {
    val exam = String()

    val minus1:(Int, Int)->Int = {a,b -> a-b}
    val minus2:(Int, Int)->Int = ::minus

    println(minus(10, 1))
    println(minus1(10, 1))
    println(minus2(10, 1))
}