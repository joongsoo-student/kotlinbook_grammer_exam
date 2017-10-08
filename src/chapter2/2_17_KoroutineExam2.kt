package chapter2

import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
    val seq = buildSequence {
        var num = 0

        while (true) {
            yieldAll(num..num+2)
            num += 2
        }
    }

    val list = seq.take(9).toList()
    println(list)
}