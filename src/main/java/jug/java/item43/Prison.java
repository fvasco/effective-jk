package jug.java.item43;

import java.util.Collections;
import java.util.List;

public class Prison {
    private String carInThePrison;

    public List<String> getCars() {
        if (carInThePrison == null) return Collections.emptyList();
        else return Collections.singletonList(carInThePrison);
    }
}
