package org.academiadecodigo.offstrings.drunkman.grid;

public enum GridDirection {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    public GridDirection oppositeDirection() {

        GridDirection opposite = null;

        switch (this) {
            case UP:
                opposite = GridDirection.DOWN;
                break;
            case DOWN:
                opposite = GridDirection.UP;
                break;
            case LEFT:
                opposite = GridDirection.RIGHT;
                break;
            case RIGHT:
                opposite = GridDirection.LEFT;
                break;
        }

        return opposite;
    }


}
