package chapter2

import java.util.Arrays

fun main(args: Array<String>) {
    var arr = Array(5, { i -> i.toString() })

    println(arr is Array<String>)
    println(Arrays.toString(arr))
}