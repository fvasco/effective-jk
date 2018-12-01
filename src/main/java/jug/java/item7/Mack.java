package jug.java.item7;

public enum Mack {
    INSTANCE;

    public void travelWith(final String passengerName) {
        unchecked(new LostPassengerException(passengerName));
    }

    private static <T extends Throwable> void unchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
