package jug.kotlin

class Prison {
    private val carInThePrison: String? = null

    val cars: List<String>
        get() = listOfNotNull(carInThePrison)
}
