package chapter2

class Calculator {
    val d = 10
    fun sum(a:Int, b:Int):Int {
        return a+b
    }
}

class MyClass {
    val calc = Calculator()

    fun Calculator.sum(a:Int, b:Int, c:Int):Int {
        return sum(a, b) + c + this.d
    }

    fun Calculator.minus(a:Int, b:Int):Int {
        return a-b
    }

    fun sum(a:Int, b:Int, c:Int):Int {
        return calc.sum(a,b,c)
    }

    fun minus(a:Int, b:Int):Int {
        return calc.minus(a, b)
    }
}

fun main(args:Array<String>) {
    val myClass = MyClass()
    println(myClass.minus(10,2))
    println(myClass.sum(1,2,3))
}
