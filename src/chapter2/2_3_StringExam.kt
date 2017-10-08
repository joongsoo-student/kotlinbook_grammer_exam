package chapter2

/**
 * Created by Daniel on 2017-08-20.
 */


fun main(args: Array<String>) {
    var oneLineStr = "한줄 문자열 선언"

    var multiLineStr = """
    |여러 줄 문자열 선언
    |두줄
    |세줄
    """

    println(oneLineStr)
    println(multiLineStr.trimMargin())
}