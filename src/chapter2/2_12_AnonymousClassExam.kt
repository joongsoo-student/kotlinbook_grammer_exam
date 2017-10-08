package chapter2

fun main(args:Array<String>) {
    val listener = object: OnClickListener() {
        override fun onClick() {
            println("익명 이너 클래스 재정의")
        }
    }

    listener.onClick()
}

open class OnClickListener {
    open fun onClick() {}
}

