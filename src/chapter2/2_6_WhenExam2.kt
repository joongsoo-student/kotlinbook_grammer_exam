package chapter2

/**
 * Created by Daniel on 2017-08-19.
 */



fun main(args: Array<String>) {
    val num:Int = 50
    val digitStr = digit(num)

    println(digitStr)
}

fun digit(num:Int) = when(num) {
    in 0..9 -> "한 자리 수"
    in 10..99 -> "두 자리 수"
    in 100..999 -> "세 자리 수"
    else -> "Out of range"
}
