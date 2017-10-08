package chapter2

/**
 * Created by Daniel on 2017-09-15.
 */

fun main(args: Array<String>) {
    //val c = chapter2.NotAccessClass() // 에러
}

class NotAccessClass private constructor() {
    init {
        // 실행되지 않는 코드
    }
}