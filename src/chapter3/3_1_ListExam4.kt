package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */


fun main(args:Array<String>) {
    var list = arrayListOf(0, 1, 2, 3, 4, 5)

    var newList = list.filter { it > 2 }
            .map { it + 1 }
            .sortedByDescending { it }

    list.parallelStream()
    println(newList)
}