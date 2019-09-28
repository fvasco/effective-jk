package jug.kotlin

open class Vise {

    var locked: Boolean = false
        private set

    open fun lock() {
        locked = true
    }

    fun unlock() {
        locked = false
    }
}

class Clamp : Vise() {

    override fun lock() {
        println("Clamp on wheel")
        super.lock()
    }

}