package chapter2

/**
 * Created by Daniel on 2017-08-30.
 */


fun invokeFunction4(f: (Int)->String) {
    val returnValue = f(10)
    println(returnValue.length)
}


fun main(args: Array<String>) {
    invokeFunction4 {
        println("단일 매개변수 it의 값 : $it")
        it.toString()
    }
}