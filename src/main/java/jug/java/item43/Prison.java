package jug.java.item43;

import java.util.Collections;
import java.util.List;

public class Prison {
    private String carInthePrison;

    public List<String> getCars() {
        if (carInthePrison == null) return Collections.emptyList();
        else return Collections.singletonList(carInthePrison);
    }
}
