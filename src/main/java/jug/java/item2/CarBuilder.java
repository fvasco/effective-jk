package jug.java.item2;

import java.awt.*;
import java.util.Objects;

public class CarBuilder {
    private String name;
    private Color color = Color.BLACK;
    private int wheels = 4;

    public CarBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder color(Color color) {
        this.color = color;
        return this;

    }

    public CarBuilder wheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public Car build() {
        Objects.requireNonNull(name);
        Objects.requireNonNull(color);
        if (name.isEmpty()) throw new IllegalStateException("Name in empty");
        if (wheels <= 0) throw new IllegalStateException("Wheels not valid");
        return new Car(name, color, wheels);
    }
}
