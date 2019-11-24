package jug.kotlin

class M134 {

    fun fire(ammunitionBelt: () -> Cartridge) {
        repeat(100) {
            val cartridge = ammunitionBelt()
            println("$cartridge fired")
        }
    }
}

class Cartridge
