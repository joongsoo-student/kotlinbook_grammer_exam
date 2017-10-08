package chapter2

/**
 * Created by Daniel on 2017-08-20.
 */


fun main(args: Array<String>) {
    var a = 10
    var b = 20

    var c = if(a==b) {
        println("if문의 코드블럭 실행")
        "a는 b와 같은 값입니다." // c에 할당
    } else {
        println("else문의 코드블럭 실행")
        "a는 b와 다른 값입니다."
    }

    println(c)
}