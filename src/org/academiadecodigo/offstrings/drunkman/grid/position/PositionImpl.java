package org.academiadecodigo.offstrings.drunkman.grid.position;

import org.academiadecodigo.offstrings.drunkman.grid.GridDirection;
import org.academiadecodigo.offstrings.drunkman.grid.GridImpl;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PositionImpl extends AbstractPosition{

    private Picture picture;
    private GridImpl grid;

    public PositionImpl(GridImpl grid, String str){
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);

        this.grid = grid;

        int x = this.grid.columnToX(getCol());
        int y = this.grid.rowToY(getRow());

        picture = new Picture(x, y, str);
        show();
    }

    public PositionImpl(int col, int row, GridImpl grid){
        super(col, row, grid);

        this.grid = grid;

        int x = this.grid.columnToX(col);
        int y = this.grid.rowToY(row);

    }

    @Override
    public void show() {
        this.picture.draw();
    }

    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        int initialCol = getCol();
        int initialRow = getRow();

        super.moveInDirection(direction, distance);

        int dx = grid.columnToX(getCol()) - grid.columnToX(initialCol);
        int dy = grid.rowToY(getRow()) - grid.rowToY(initialRow);

        this.picture.translate(dx,dy);

    }

}
