package jug.kotlin

class Runners(vararg cars: String) : List<String> by cars.toList() {

    override fun toString() =
            buildString {
                append("Runners:\n")
                for (car in this) append(" - ", car, "\n")
            }
}
