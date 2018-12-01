package jug.java.item7;

import java.util.Objects;

public class LostPassengerException extends Exception {

    public LostPassengerException(String passengerName) {
        super(passengerName + " lost");
        Objects.requireNonNull(passengerName);
    }
}
