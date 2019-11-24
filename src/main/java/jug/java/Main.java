package jug.java;

import jug.java.item16.BestBumperOintmentCompany;
import jug.java.item17.Ramon;
import jug.java.item18.Runners;
import jug.java.item2.CarBuilder;
import jug.java.item26.DemolitionDerby;
import jug.java.item3.StanleyStatue;
import jug.java.item4.Util;
import jug.java.item49.City;
import jug.java.item54.Prison;
import jug.java.item83.LightningMcQueenBestFans;
import jug.java.stream.Race;
import jug.kotlin.Position;
import jug.kotlin.Runner;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Main {
    public static Object item2() {
        return new CarBuilder()
                .name("Lightning McQueen")
                .color(Color.RED)
                .build();
    }

    public static void item3() {
        StanleyStatue.INSTANCE.fly();
    }

    public static void item4() {
        Util.startRace();
    }

    public static void item14() {
        var bestBumperOintmentCompany = new BestBumperOintmentCompany();
        bestBumperOintmentCompany.setName("Rust-Eze");
    }

    public static Object item16() {
        var runners = new Runners(List.of("Strip \"The King\" Weathers", "Chick Hicks", "Lightning McQueen"));
        return runners.toString();
    }

    public static void item17() {
        final var ramon = new Ramon(false, Position.DOWN, Color.RED);
        final var ramonUp = ramon.withPosition(Position.UP);
    }

    public static void item26() {
        var demolitionDerby = new DemolitionDerby();

        var winner = demolitionDerby
                .findWinner()
                .map(Runner::getName)
                .orElse("No winner");
    }

    public static Object item38() {
        return new City("Radiator Springs");
    }

    public static void item43() {
        var prison = new Prison();
        var cars = prison.getCars();
        for (var car : cars) System.out.println(car);
    }

    public static Object lazy() {
        var lightningMcQueenBestFans = new LightningMcQueenBestFans();
        return lightningMcQueenBestFans.getList();
    }

    public static Object stream() {
        var races = Stream.of(
                new Race("Strip \"The King\" Weathers", 20, Duration.ofSeconds(1234)),
                new Race("\"Junior\" #8", 17, Duration.ofSeconds(789)),
                new Race("Chick Hicks", 20, Duration.ofSeconds(1234)),
                new Race("Mario Andretti #11", 20, Duration.ofSeconds(2345)),
                new Race("Lightning McQueen", 20, Duration.ofSeconds(1234))
        );

        return races
                .filter(race -> race.getLap() == 20)
                .collect(Collectors.groupingBy(Race::getTime, TreeMap::new, Collectors.toList()))
                .firstEntry()
                .getValue();
    }
}
