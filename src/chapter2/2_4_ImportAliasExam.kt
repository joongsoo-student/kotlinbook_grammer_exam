package chapter2

import java.util.Random as R

fun main(args:Array<String>) {
    val random = R()
    val randomNumber = random.nextInt()

    println("랜덤하게 뽑은 숫자는 ${randomNumber} 입니다.")
}