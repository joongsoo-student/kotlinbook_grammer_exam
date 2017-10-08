package chapter2

/**
 * Created by Daniel on 2017-08-29.
 */


fun main(args: Array<String>) {
    printNumbers(1, 2, 3, 4)
}

fun printNumbers(vararg numbers:Int) {
    for(number in numbers) {
        println(number)
    }
}