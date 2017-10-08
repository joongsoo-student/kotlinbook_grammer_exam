package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */


fun main(args:Array<String>) {
    var list = listOf("A", "B", "C", "D", "E")

    for(idx in 0..(list.size-1)) {
        println(list[idx])
    }
}