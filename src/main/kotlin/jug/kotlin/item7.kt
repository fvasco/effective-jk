package jug.kotlin

import jug.java.item7.LostPassengerException

object Mack {
    fun travelWith(passengerName: String) {
        throw LostPassengerException(passengerName)
    }
}
