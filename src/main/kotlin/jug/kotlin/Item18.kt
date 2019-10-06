package jug.kotlin

class Runners(cars: List<String>) : List<String> by cars {

    override fun toString() =
            buildString {
                append("Runners:\n")
                forEach { car -> append(" - ", car, "\n") }
            }
}
