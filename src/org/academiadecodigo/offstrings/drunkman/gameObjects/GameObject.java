package org.academiadecodigo.offstrings.drunkman.gameObjects;

import org.academiadecodigo.offstrings.drunkman.grid.Grid;
import org.academiadecodigo.offstrings.drunkman.grid.position.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

interface GameObject {

    Grid getGrid();

    void setGrid(Grid grid);

    Position getPosition();

    void setPosition(Position position);

    Picture getPicture();

}
