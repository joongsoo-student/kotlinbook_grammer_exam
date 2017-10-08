package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */



fun main(args:Array<String>) {
    var num = run {
        1 +2
    }
    println(num)

    run {
        var a = 10
        println(a)
    }
}