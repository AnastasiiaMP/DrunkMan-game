package org.academiadecodigo.offstrings.drunkman.players;

import org.academiadecodigo.offstrings.drunkman.grid.Grid;
import org.academiadecodigo.offstrings.drunkman.grid.GridDirection;
import org.academiadecodigo.offstrings.drunkman.grid.position.Position;

import java.awt.*;

public abstract class Player {

    private Position pos;
    private Grid grid;
    private boolean picked;
    private boolean check;
    protected Character character;
    protected GridDirection currentDirection;
    protected boolean up;
    protected boolean down;
    protected boolean left;
    protected boolean right;
    protected int score;
    protected int speed;

    public Player(Position pos) {
        this.pos = pos;
        score = 1;
        speed = 0;
        check = false;
        up = false;
        down = false;
        left = false;
        right = false;

    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public Grid getGrid() {
        return this.grid;
    }

    public Position getPos() {
        return pos;
    }

    public void accelerate(GridDirection direction, int speed) {

        GridDirection newDirection = direction;

        if (isHittingWall()) {
            newDirection = direction.oppositeDirection();
        }


        currentDirection = newDirection;
        for (int i = 0; i < speed; i++) {
            getPos().moveInDirection(newDirection, 1);

        }

    }

    public boolean isHittingWall() {

        switch (currentDirection) {
            case LEFT:
                if (getPos().getCol() == 0) {
                    return true;
                }
                break;
            case RIGHT:
                if (getPos().getCol() == grid.getCols() - 1) {
                    return true;
                }
                break;
            case UP:
                if (getPos().getRow() == 0) {
                    return true;
                }
                break;
            case DOWN:
                if (getPos().getRow() == grid.getRows() - 1) {
                    return true;
                }
        }

        return false;

    }
    public void setCharacter(Character character) {
        this.character = character;
    }public int getScore () {
        return score;
    }

    public void setScore ( int score){
        this.score = score;
    }

    public void setPos (Position pos){
        this.pos = pos;
    }

    public void isPicked() {
        picked = true;
    }
    public boolean getPicked() {
        return picked;

    }

    public void move() {};

}
