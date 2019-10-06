package jug.java.item17;

import jug.kotlin.Position;

import java.awt.*;

public final class Ramon {

    private final boolean working;

    private final Position position;

    private final Color color;

    public Ramon(boolean working, Position position, Color color) {
        this.working = working;
        this.position = position;
        this.color = color;
    }

    public Ramon withPosition(Position position) {
        return new Ramon(working, position, color);
    }

    // other methods

}
