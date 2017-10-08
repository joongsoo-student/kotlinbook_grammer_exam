package chapter2

/**
 * Created by Daniel on 2017-10-08.
 */

class CompanionTestClass {
    val str1 = "Hello!"
    val str3 = "Korea!"

    fun sum(a:Int, b:Int):Int {
        return a+b
    }

    companion object Companion {
        val str2 = "Hi!"
        val str3 = "USA!"

        fun minus(a:Int, b:Int):Int {
            return a-b
        }
    }
}

fun main(args:Array<String>) {
    var obj = CompanionTestClass()
    println(obj.str1)
    println(obj.sum(10, 5))

    println(CompanionTestClass.minus(10, 5))
    println(CompanionTestClass.minus(10, 5))

    println(CompanionTestClass.str2)
    println(CompanionTestClass.str2)

    println(CompanionTestClass().str3)
    println(CompanionTestClass.str3)
}