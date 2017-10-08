package chapter2

/**
 * Created by Daniel on 2017-08-28.
 */


fun main(args:Array<String>) {
    val str = "a"
    var num:Int

    try {
        num = str.toInt()
    } catch(e:NumberFormatException) {
        println("예외 발생")
        num = 0
    } finally {
        println("finally 구문")
    }

    println("num의 값은 $num 입니다.")
}