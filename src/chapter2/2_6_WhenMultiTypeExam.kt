package chapter2

/**
 * Created by Daniel on 2017-08-19.
 */



fun main(args: Array<String>) {
    var str:Any = "ABCDEFG"

    when(str) {
        is TestClass -> println(str.print())
        is String -> println(str.length)
        is Int -> println(str.minus(10))
    }
}

class TestClass {
    fun print() {
        println("TestClass의 print메소드 실행")
    }
}
