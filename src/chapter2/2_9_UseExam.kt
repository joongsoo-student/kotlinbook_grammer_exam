package chapter2

import java.io.File
import java.io.FileNotFoundException

/**
 * Created by Daniel on 2017-10-06.
 */

fun main(args:Array<String>) {
    val path = "D:\\test.txt"
    val writeString = "Hello World!"

    File(path).outputStream().use {
        it.write(writeString.toByteArray())
    }

    try {
        File(path).inputStream().use {
            println(String(it.readBytes()))
        }
    } catch(e:FileNotFoundException) {
        println("File Not Found!")
    }
}