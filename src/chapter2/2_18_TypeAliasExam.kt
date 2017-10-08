package chapter2

typealias StringArrayList = ArrayList<String>

fun main(args: Array<String>) {
    var strArrayList = StringArrayList()

    strArrayList.add("Hi")
    strArrayList.add("Hello")

    println(strArrayList)
}