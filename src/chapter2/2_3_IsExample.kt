package chapter2

/**
 * Created by Daniel on 2017-08-20.
 */


fun main(args: Array<String>) {
    val str:Any = "문자열"

    if(str is String) {
        println("str은 문자열입니다.")
    } else if(str is Int) {
        println("str은 정수입니다.")
    } else {
        println("str은 무슨 타입인지 모르겠습니다.")
    }
}