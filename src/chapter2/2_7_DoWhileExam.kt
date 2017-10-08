package chapter2

/**
 * Created by Daniel on 2017-08-19.
 */


import java.util.Random

fun main(args: Array<String>) {
    val gen = NumberGenerator()

    do {
        val number = gen.generateRandomNumber()
        println(number)
    }while(number % 2 == 0)
}

class NumberGenerator {
    val random = Random()

    fun generateRandomNumber() : Int {
        return random.nextInt(100)
    }
}
