package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */


fun main(args:Array<String>) {
    var list1 = ArrayList<Int>()
    list1.add(0)
    list1.add(1)
    println(list1)

    var list2 = arrayListOf(0, 1, 2, 3, 4)
    list2[0] = 10
    list2.add(20)
    println(list2)
}