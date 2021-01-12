package org.academiadecodigo.offstrings.drunkman.gameObjects;

import org.academiadecodigo.offstrings.drunkman.grid.Grid;
import org.academiadecodigo.offstrings.drunkman.grid.position.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class AbstractGameObject implements GameObject {

    protected Position position;
    protected Grid grid;
    protected Picture picture;
    protected boolean samePosition;

    public AbstractGameObject() {
        samePosition = false;
    }


    @Override
    public Grid getGrid() {
        return grid;
    }

    @Override
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Picture getPicture() {
        return picture;
    }

}
