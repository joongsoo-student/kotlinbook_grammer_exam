package chapter2

import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
    val seq = buildSequence {
        for (i in 0..10 step 2) {
            yield(i)
        }
    }

    seq.forEach {
        println(it)
    }
}