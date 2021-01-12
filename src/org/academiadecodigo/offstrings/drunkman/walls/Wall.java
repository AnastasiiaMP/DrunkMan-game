package org.academiadecodigo.offstrings.drunkman.walls;

import org.academiadecodigo.offstrings.drunkman.grid.Grid;
import org.academiadecodigo.offstrings.drunkman.grid.position.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Wall {

    private Position pos;
    private Grid grid;
    private Picture picture;

    public Wall(Position pos){
        this.pos = pos;

    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }


    public Position getPos() {
        return pos;

    }

    public void setPos(Position pos) {
        this.pos = pos;
        this.picture = new Picture(columnToX(pos.getCol()), rowToY(pos.getRow()), "recourses/wall.png");
        this.picture.draw();
    }

    public int rowToY(int row) {
        return 10 + (30 * row);
    }

    public int columnToX(int column) {
        return 10 + (30 * column);
    }
}



