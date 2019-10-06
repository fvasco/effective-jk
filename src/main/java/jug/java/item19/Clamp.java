package jug.java.item19;

public final class Clamp extends Vise {

    @Override
    public void unlock() {
        System.out.println("Wheel released");
        super.unlock();
    }
}
