package jug.java.item17;

public final class Clamp extends Vise {

    public void lock() {
        System.out.println("Clamp on wheel");
        super.lock();
    }
}
