package chapter2

fun main(args:Array<String>) {
    val number1:Int? = 0
    val number2:Int? = null


    number1?.let {
        println("number1은 Null이 아닙니다")
        println(it.toString())
    }

    number2?.let {
        println("number2는 Null이 아닙니다")
        println(it.toString())
    }
}