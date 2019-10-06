package jug.java.item49;

public class City {
    private final String name;

    public City(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Missing name");
        }
        this.name = name;
    }
}
