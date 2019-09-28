package jug.kotlin

class City(val name: String) {
    init {
        require(name.isNotEmpty()) { "Missing name" }
    }
}
