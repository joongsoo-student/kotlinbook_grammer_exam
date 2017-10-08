package chapter2

/**
 * Created by Daniel on 2017-10-06.
 */

fun main(args:Array<String>) {
    val arr = arrayOf("A", "B", "C", "D", "E")

    for(i in arr) {
        println(i)
        if(i == "C")
            break
    }
}