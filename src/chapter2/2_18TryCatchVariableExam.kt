package chapter2

fun main(args: Array<String>) {
    val number = try {
        "10A".toInt()
    } catch(e:NumberFormatException) {
        println("예외 발생")
        0
    }

    println("number의 값은 $number 입니다.")
}
