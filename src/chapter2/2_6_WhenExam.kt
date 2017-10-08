package chapter2

/**
 * Created by Daniel on 2017-08-19.
 */



fun main(args: Array<String>) {
    var num:Int = 10

    when(num) {
        0 -> println("0 입니다")
        5 -> println("5 입니다")
        10 -> println("10 입니다")
        else -> {
            println("0, 5, 10에 속하지 않습니다.")
            println("이렇게 여러 라인을 쓸 수 있다.")
        }
    }
}
