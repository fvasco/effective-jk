package jug.java.item10;

import java.util.Objects;

public final class Speedway {

    private String name;

    private int laps;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speedway speedway = (Speedway) o;
        return laps == speedway.laps &&
                name.equals(speedway.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, laps);
    }

    @Override
    public String toString() {
        return "Speedway{" +
                "name='" + name + '\'' +
                ", laps=" + laps +
                '}';
    }
}
