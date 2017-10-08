package chapter2

/**
 * Created by Daniel on 2017-10-07.
 */

object NullCheckExam2 {
    fun nullCheckReturn(str:String?) {
        str ?: return
        println(str)
    }

    fun nullCheckBreak(arr: Array<String?>) {
        for(i in arr) {
            i ?: break
            println(i)
        }
    }
}

fun main(args:Array<String>) {
    NullCheckExam2.nullCheckReturn(null)
    NullCheckExam2.nullCheckReturn("Hello World!")

    val arr = arrayOf("A", "B", null, "C", "D")
    NullCheckExam2.nullCheckBreak(arr)
}