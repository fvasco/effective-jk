package jug.kotlin

open class Vise {

    var locked: Boolean = false
        private set

    fun lock() {
        locked = true
    }

    open fun unlock() {
        locked = false
    }
}

class Clamp : Vise() {

    override fun unlock() {
        println("Wheel released")
        super.unlock()
    }

}