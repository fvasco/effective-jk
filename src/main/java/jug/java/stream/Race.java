package jug.java.stream;

import java.time.Duration;

public class Race {
    private final String car;
    private final int lap;
    private final Duration time;

    public Race(String car, int lap, Duration time) {
        this.car = car;
        this.lap = lap;
        this.time = time;
    }

    public String getCar() {
        return car;
    }

    public int getLap() {
        return lap;
    }

    public Duration getTime() {
        return time;
    }
}
