package jug.kotlin

class BestBumperOintmentCompany {

    var name: String? = null

    var website: String? = null

    val link get() = "<a href='$website'>$name</a>"
}
