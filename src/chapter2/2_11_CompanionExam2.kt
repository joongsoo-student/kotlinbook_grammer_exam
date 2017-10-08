package chapter2

/**
 * Created by Daniel on 2017-10-08.
 */

class CompanionTestClass2 {
    companion object {
        val str = "Hi!"
    }
}

fun main(args:Array<String>) {
    println(CompanionTestClass2.str)
}