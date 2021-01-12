package org.academiadecodigo.offstrings.drunkman.grid.position;

import org.academiadecodigo.offstrings.drunkman.grid.Grid;
import org.academiadecodigo.offstrings.drunkman.grid.GridDirection;
import org.academiadecodigo.offstrings.drunkman.grid.GridImpl;

public abstract class AbstractPosition implements Position{

    private int col;
    private int row;
    protected GridImpl grid;

    public AbstractPosition(int col, int row, GridImpl grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;

    }

    public Grid getGrid() {
        return grid;
    }

    @Override
    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
        show();
    }


    @Override
    public int getCol() {
        return col;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        switch (direction) {

            case UP:
                moveUp(distance);
                break;
            case DOWN:
                moveDown(distance);
                break;
            case LEFT:
                moveLeft(distance);
                break;
            case RIGHT:
                moveRight(distance);
                break;
        }

    }

    private void moveUp(int dist) {

        int maxRowsUp = Math.min(dist,getRow());
        setPos(getCol(), getRow() - maxRowsUp);

    }

    private void moveDown(int dist) {

        int maxRowsDown = Math.min(getGrid().getRows() - (getRow() + 1),dist);
        setPos(getCol(), getRow() + maxRowsDown);

    }

    private void moveLeft(int dist) {

        int maxRowsLeft = Math.min(dist,getCol());
        setPos(getCol() - maxRowsLeft, getRow());

    }

    private void moveRight(int dist) {

        int maxRowsRight = Math.min(getGrid().getCols() - (getCol() + 1), dist);
        setPos(getCol() + maxRowsRight, getRow());
    }
}


