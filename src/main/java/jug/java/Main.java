package jug.java;

import jug.java.item14.BestBumperOintmentCompany;
import jug.java.item16.Runners;
import jug.java.item2.CarBuilder;
import jug.java.item38.City;
import jug.java.item43.Prison;
import jug.java.item7.Mack;

import java.awt.*;
import java.util.Arrays;

public final class Main {
    public static Object item2() {
        return new CarBuilder()
                .name("Lightning McQueen")
                .color(Color.RED)
                .build();
    }

    public static Object item4() {
        var cars = Arrays.asList("Lightning McQueen", "Sally Carrera");
        return cars;
    }

    public static void item7() {
        Mack.INSTANCE.travelWith("Lightning McQueen");
    }

    public static void item14() {
        var bestBumperOintmentCompany = new BestBumperOintmentCompany();
        bestBumperOintmentCompany.setName("Rust-Eze");
    }

    public static Object item16() {
        var runners = new Runners("Strip \"The King\" Weathers", "Chick Hicks", "Lightning McQueen");
        return runners.toString();
    }

    public static Object item38() {
        return new City("Radiator Springs");
    }

    public static void item43() {
        var prison = new Prison();
        var cars = prison.getCars();
        for (var car : cars) System.out.println(car);
    }
}
