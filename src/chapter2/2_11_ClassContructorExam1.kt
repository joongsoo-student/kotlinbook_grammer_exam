package chapter2

/**
 * Created by Daniel on 2017-09-15.
 */

fun main(args: Array<String>) {
    val myBackpack = Backpack("Incase", "Red")
}

class Backpack(brand:String, color:String) {
    init {
        println("브랜드는 ${brand}이고 색상은 ${color}입니다.")
    }
}