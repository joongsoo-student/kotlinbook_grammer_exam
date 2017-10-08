package chapter2

import java.io.IOException

fun main(args: Array<String>) {
    throwIOException()
}

fun throwIOException():Int {
    throw IOException()
}