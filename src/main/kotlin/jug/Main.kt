package jug

import jug.kotlin.*
import java.awt.Color
import java.awt.Color.RED
import java.time.Duration

fun item2() =
        Car(
                name = "Lightning McQueen",
                color = RED
        )

fun item3() = StanleyStatue.fly()

fun item4() = startRace()

fun item16() {
    val bestBumperOintmentCompany = BestBumperOintmentCompany()
    bestBumperOintmentCompany.name = "Rust-Eze"
}

fun item17() {
    val ramon = Ramon(working = false, position = Position.DOWN, color = Color.RED)
    val ramonUp = ramon.copy(position = Position.UP)
}

fun item18() {
    val runners = Runners(listOf("Strip \"The King\" Weathers", "Chick Hicks", "Lightning McQueen"))
    println(runners)
}

fun item26() {

    val winner = DemolitionDerby.findWinner()?.name ?: "No winner"

}

fun item38() = City("Radiator Springs")

fun item43() {
    val prison = Prison()
    val cars = prison.cars
    cars.forEach(::println)
}

fun lazy() = LightningMcQueenBestFans().list

fun stream(): List<Race> {
    val races = sequenceOf(
            Race("Strip \"The King\" Weathers", 20, Duration.ofSeconds(1234)),
            Race("\"Junior\" #8", 17, Duration.ofSeconds(789)),
            Race("Chick Hicks", 20, Duration.ofSeconds(1234)),
            Race("Mario Andretti #11", 20, Duration.ofSeconds(2345)),
            Race("Lightning McQueen", 20, Duration.ofSeconds(1234))
    )

    val winners = races
            .filter { it.lap == 20 }
            .groupBy { it.time }
            .minBy { (time) -> time }
            ?.value.orEmpty()

    return winners
}
