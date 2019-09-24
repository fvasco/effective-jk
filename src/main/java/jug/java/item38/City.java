package jug.java.item38;

public class City {
    private final String name;

    public City(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Missing name");
        }
        this.name = name;
    }
}
