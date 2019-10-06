package jug.kotlin

fun engage(target: String, weaponSupplier: () -> Weapon) {
    val weapon = weaponSupplier()
    println("$target engaged using $weapon")
    weapon.fire()
}

interface Weapon {
    fun fire()
}