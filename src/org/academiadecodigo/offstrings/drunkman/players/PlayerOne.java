package org.academiadecodigo.offstrings.drunkman.players;

import org.academiadecodigo.offstrings.drunkman.grid.GridDirection;
import org.academiadecodigo.offstrings.drunkman.grid.position.Position;
import org.academiadecodigo.offstrings.drunkman.walls.WallsFactory;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class PlayerOne extends Player implements KeyboardHandler {

    private Keyboard keyboard;


    public PlayerOne(Position pos) {
        super(pos);
        keyboard = new Keyboard(this);
        init();
    }


    public void init() {

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent leftR = new KeyboardEvent();
        leftR.setKey(KeyboardEvent.KEY_LEFT);
        leftR.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        KeyboardEvent rightR = new KeyboardEvent();
        rightR.setKey(KeyboardEvent.KEY_RIGHT);
        rightR.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        KeyboardEvent upR = new KeyboardEvent();
        upR.setKey(KeyboardEvent.KEY_UP);
        upR.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        KeyboardEvent downR = new KeyboardEvent();
        downR.setKey(KeyboardEvent.KEY_DOWN);
        downR.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(leftR);
        keyboard.addEventListener(rightR);
        keyboard.addEventListener(upR);
        keyboard.addEventListener(downR);
    }

    @Override
    public void move() {
        accelerate(currentDirection, speed);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void accelerate(GridDirection direction, int speed) {

        currentDirection = direction;
        for (int i = 0; i < speed; i++) {
            getPos().moveInDirection(direction, 1);
        }

        getGrid().hasCollided(this);
    }

    public void moveInDirection() {
        if(left) {
            currentDirection = GridDirection.LEFT;
        }
        if(right) {
            currentDirection = GridDirection.RIGHT;
        }
        if(up) {
            currentDirection = GridDirection.UP;
        }
        if(down) {
            currentDirection = GridDirection.DOWN;
        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:

                for (int i = 0; i < WallsFactory.getWalls().length; i++) {

                    if (getPos().getCol() - 1 == WallsFactory.getWalls()[i].getPos().getCol() && getPos().getRow() == WallsFactory.getWalls()[i].getPos().getRow()) {
                        return;
                    }
                }

                left = true;


                moveInDirection();
                break;

            case KeyboardEvent.KEY_RIGHT:
                for (int i = 0; i < WallsFactory.getWalls().length; i++) {

                    if (getPos().getCol() + 1 == WallsFactory.getWalls()[i].getPos().getCol() && getPos().getRow() == WallsFactory.getWalls()[i].getPos().getRow()) {

                        return;
                    }
                }
                right = true;
                moveInDirection();

                break;
            case KeyboardEvent.KEY_UP:
                for (int i = 0; i < WallsFactory.getWalls().length; i++) {

                    if (getPos().getCol() == WallsFactory.getWalls()[i].getPos().getCol() && getPos().getRow() - 1 == WallsFactory.getWalls()[i].getPos().getRow()) {

                        return;
                    }
                }
                up = true;
                moveInDirection();
                break;
            case KeyboardEvent.KEY_DOWN:
                for (int i = 0; i < WallsFactory.getWalls().length; i++) {

                    if (getPos().getCol() == WallsFactory.getWalls()[i].getPos().getCol() && getPos().getRow() + 1 == WallsFactory.getWalls()[i].getPos().getRow()) {

                        return;
                    }
                }
                down = true;
                moveInDirection();
                break;
        }

        if (speed == 0) {
            accelerate(currentDirection, 1);
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                left = false;
                break;
            case KeyboardEvent.KEY_RIGHT:
                right = false;
                break;
            case KeyboardEvent.KEY_UP:
                up = false;
                break;
            case KeyboardEvent.KEY_DOWN:
                down = false;
                break;

        }

    }

}


