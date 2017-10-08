package chapter2

/**
 * Created by Daniel on 2017-08-30.
 */


fun invokeFunction1(f: ()->Unit) {
    f()
}

fun invokeFunction2(num:Int, f: ()->String) {
    println("인자로 받은 숫자 : $num")
    var reternValue = f()
    println(reternValue)
}

fun main(args: Array<String>) {
    invokeFunction1 { println("콜백 함수 실행") }

    invokeFunction2(10, {
        println("여러줄 실행")
        "리턴 문자열"
    })

    for(i in 1..5) {
        Thread {
            println("${i}번 스레드")
        } .start()
    }
}