package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */


fun main(args:Array<String>) {
    var list1 = List(5, {i -> i+i})
    println(list1)

    var list2 = listOf(0, 1, 2, 3, 4)
    println(list2)
}