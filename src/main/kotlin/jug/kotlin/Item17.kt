package jug.kotlin

import java.awt.Color

data class Ramon(
        val working: Boolean,
        val position: Position,
        val color: Color
)

enum class Position {
    UP, DOWN
}
