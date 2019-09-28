package jug.java.item17;

public class Vise {

    private boolean locked;

    public final boolean getLocked() {
        return locked;
    }

    private void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void lock() {
        setLocked(true);
    }

    public final void unlock() {
        setLocked(false);
    }
}
