package chapter2

/**
 * Created by Daniel on 2017-08-19.
 */




fun main(args: Array<String>) {
    var arr = arrayOf("A", "B", "C", "D", "E")

    for((idx, value) in arr.withIndex()) {
        println("$idx 번째 값은 $value 입니다.")
    }
}
