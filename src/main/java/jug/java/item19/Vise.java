package jug.java.item19;

public class Vise {

    private boolean locked;

    public final boolean getLocked() {
        return locked;
    }

    private void setLocked(boolean locked) {
        this.locked = locked;
    }

    public final void lock() {
        setLocked(true);
    }

    public void unlock() {
        setLocked(false);
    }
}
