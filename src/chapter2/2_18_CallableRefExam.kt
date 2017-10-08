package chapter2
class Filter {
    fun over10(i:Int) = i > 10
}

fun main(args: Array<String>) {
    var filter = Filter()
    var list = listOf(0, 5, 10, 15, 20, 25, 30)

    var newList = list.filter( filter::over10 )
    println(newList)
}