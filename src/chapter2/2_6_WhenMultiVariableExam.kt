package chapter2

/**
 * Created by Daniel on 2017-08-19.
 */



fun main(args: Array<String>) {
    var num:Int = 10
    var arr:IntArray = intArrayOf(6,7,8,9)

    when(num) {
        0,1  -> println("0 혹은 1 입니다")
        in 2..5 -> println("2와 5 사이의 수 입니다")
        in arr -> println("arr 배열에 속합니다")
        !in arr -> println("arr 배열에 속하지 않습니다")
    }
}
