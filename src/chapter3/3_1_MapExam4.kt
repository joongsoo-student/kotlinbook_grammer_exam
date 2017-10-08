package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */


fun main(args:Array<String>) {
    var map = hashMapOf<String, String>()

    map["A"] = "Joongsoo"
    map["B"] = "Younghwan"
    map["C"] = "Minji"

    map.filter { it.value.startsWith("Y") || it.value.startsWith("M") }
            .forEach { _, v -> println(v) }
}