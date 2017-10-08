package chapter2

/**
 * Created by Daniel on 2017-10-06.
 */

fun main(args:Array<String>) {

    label@ for(i in 0..9) {
        for(j in 0..9) {
            println("$i / $j")

            if(i==3 && j==3) {
                break@label
            }
        }
    }

}