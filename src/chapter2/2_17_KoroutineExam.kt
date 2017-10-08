package chapter2

import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
    val seq = buildSequence {
        var num = 0

        while(true) {
            yield(num)
            num += 2
        }
    }

    seq.take(5).forEach {
        println(it)
    }
}