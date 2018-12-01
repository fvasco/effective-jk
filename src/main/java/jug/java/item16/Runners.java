package jug.java.item16;

import java.util.Arrays;

public class Runners extends ListDelegate<String> {

    public Runners(final String... cars) {
        super(Arrays.asList(cars));
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Runners:\n");
        for (var car : this) sb.append(" - ").append(car).append("\n");
        return sb.toString();
    }
}
