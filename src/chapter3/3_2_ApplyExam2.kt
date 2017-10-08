package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */

class Person {
    var name = ""
    var age = 0

    fun printMyInfo() {
        println("제 이름은 ${name}이고 ${age} 살입니다.")
    }
}

fun main(args:Array<String>) {
    var person = Person()

    person.apply {
        name = "박중수"
        age = 26
    }.printMyInfo()
}