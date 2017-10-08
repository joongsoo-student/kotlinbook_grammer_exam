package chapter2

/**
 * Created by Daniel on 2017-08-20.
 */


fun main(args: Array<String>) {
    var str = "abcdefg"

    println(str[0]) // a가 출력된다.

    for(c in str) {
        println(c) // 각 요소가 하나씩 출력된다.
    }
}