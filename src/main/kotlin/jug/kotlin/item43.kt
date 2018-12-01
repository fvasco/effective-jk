package jug.kotlin

class Prison {
    private val carInthePrison: String? = null

    val cars: List<String>?
        get() = carInthePrison?.let { listOf(it) }
}
