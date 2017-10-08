package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */


fun main(args:Array<String>) {
    var list = (0..50).filter { it % 2 == 0 }
            .filter { it > 20 }
            .sortedByDescending { it }

    println(list)
}