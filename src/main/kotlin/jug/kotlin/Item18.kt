package jug.kotlin

class Runners(cars: List<String>) : List<String> by cars {

    override fun toString() =
            joinToString(
                    prefix = "Runners:\n",
                    separator = "\n"
            ) { car -> " - $car" }
}
