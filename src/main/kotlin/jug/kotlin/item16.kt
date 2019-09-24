package jug.kotlin

class Runners(cars: List<String>) : List<String> by cars {

    override fun toString() =
            buildString {
                append("Runners:\n")
                for (car in this) append(" - ", car, "\n")
            }
}
