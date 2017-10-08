package chapter2

/**
 * Created by Daniel on 2017-10-07.
 */

class NullCheckExam {
    var str1:String? = null

    fun nullCheck() {
        var str2:String? = "ABCD"

        str1 ?: let {
            println("str1은 null 입니다.")
        }

        str2 ?: let {
            println("str2는 null 입니다.")
        }
    }
}

fun main(args:Array<String>) {
    val exam = NullCheckExam()
    exam.nullCheck()
}