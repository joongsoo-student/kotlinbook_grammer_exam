package chapter2

/**
 * Created by Daniel on 2017-08-30.
 */


fun invokeFunction3(f: (Int, Int)->Int) {
    val returnValue = f(10, 20)
    println(returnValue)
}

fun sum(a:Int, b:Int):Int {
    return a+b
}


fun main(args: Array<String>) {
    /*
    chapter2.invokeFunction3({ a, b ->
        val c = a + b
        c
    })
    */

    invokeFunction3(::sum)
}