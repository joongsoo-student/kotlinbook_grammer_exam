package chapter2
fun main(args: Array<String>) {
    var str = "10"
    var number:Int = try {
        str.toInt()
    } catch(nfe:NumberFormatException) {
        0
    }
    println(number)

}

