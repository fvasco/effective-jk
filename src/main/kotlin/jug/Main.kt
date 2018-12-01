package jug

import jug.kotlin.*
import java.awt.Color.RED

fun item2() = Car(
        name = "Lightning McQueen",
        color = RED
)

fun item4() = listOf("Lightning McQueen", "Sally Carrera")


fun item7() {
    Mack.travelWith("Lightning McQueen")
}

fun item14() {
    val bestBumperOintmentCompany = BestBumperOintmentCompany()
    bestBumperOintmentCompany.name = "Rust-Eze"
}

fun item16(): Any {
    val runners = Runners("Strip \"The King\" Weathers", "Chick Hicks", "Lightning McQueen")
    return runners.toString()
}

fun item38() = City("Radiator Springs")

fun item43() {
    val prison = Prison()
    val cars = prison.cars
    if (cars != null) {
        for (car in cars) println(car)
    }
}
