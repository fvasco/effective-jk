package jug.kotlin

import java.awt.Color

data class Car(
        val name: String,
        val color: Color = Color.BLACK,
        val wheels: Int = 4
) {
    init {
        require(name.isNotEmpty()) { "Name in empty" }
        require(wheels > 0) { "Wheels not valid" }
    }
}
