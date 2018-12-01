package jug

import jug.kotlin.*
import java.awt.Color.RED
import java.time.Duration
import java.util.*

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

fun stream(): List<Race> {
    val races = sequenceOf(
            Race("Strip \"The King\" Weathers", 20, Duration.ofSeconds(1234)),
            Race("Chick Hicks", 20, Duration.ofSeconds(1234)),
            Race("Lightning McQueen", 20, Duration.ofSeconds(1234)),
            Race("\"Junior\" #8", 17, Duration.ofSeconds(789)),
            Race("Mario Andretti #11", 20, Duration.ofSeconds(2345))
    )

    val winners = races
            .filter { it.lap == 20 }
            .groupByTo(TreeMap()) { it.time }
            .firstEntry()
            .value

    return winners
}
