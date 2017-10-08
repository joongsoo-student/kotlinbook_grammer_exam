package chapter3

/**
 * Created by Daniel on 2017-10-08.
 */


fun main(args:Array<String>) {
    var intRange = IntRange(0, 10)
    var charRange = CharRange('a', 'e')
    var longRange = LongRange(11, 20)

    for(i in intRange)
        println(i)

    for(i in charRange)
        println(i)

    for(i in longRange)
        println(i)
}