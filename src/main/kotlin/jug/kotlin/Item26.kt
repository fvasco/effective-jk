package jug.kotlin

object DemolitionDerby {

    fun findWinner(): Runner? = MissFritter

}

object MissFritter : Runner {
    override val name: String
        get() = "Miss Fritter"
}

interface Runner {
    val name: String
}
