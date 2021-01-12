package org.academiadecodigo.offstrings.drunkman.grid.position;

import org.academiadecodigo.offstrings.drunkman.grid.GridDirection;

public interface Position {

    int getCol();

    int getRow();

    void setPos(int col, int row);

    void show();

    void moveInDirection(GridDirection direction, int distance);

}
