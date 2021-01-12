package org.academiadecodigo.offstrings.drunkman.grid;

import org.academiadecodigo.offstrings.drunkman.Game;
import org.academiadecodigo.offstrings.drunkman.grid.position.Position;
import org.academiadecodigo.offstrings.drunkman.grid.position.PositionImpl;
import org.academiadecodigo.offstrings.drunkman.players.Player;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GridImpl implements Grid{

    public static final int PADDING = 10;

    private int cellSize;
    private int cols;
    private int rows;
    public static Text score1;
    public static Text score2;

    private Rectangle field;
    public Picture[] pictures;


    public GridImpl(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        cellSize = 30;

        score1 = new Text(250, 20, null);
        score1.grow(15, 15);
        score1.setColor(Color.BLACK);

        score2 = new Text(1450, 20, null);
        score2.grow(15, 15);
        score2.setColor(Color.BLACK);

    }

    @Override
    public void init() {

        this.field = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
        this.field.draw();

        pictures = new Picture[44];
        pictures[0] = new Picture(columnToX(20), rowToY(10), "recourses/Pizza.png");
        pictures[0].draw();
        pictures[1] = new Picture(columnToX(6), rowToY(12), "recourses/Pizza.png");
        pictures[1].draw();
        pictures[2] = new Picture(columnToX(20), rowToY(16), "recourses/Pizza.png");
        pictures[2].draw();
        pictures[3] = new Picture(columnToX(7), rowToY(19), "recourses/Pizza.png");
        pictures[3].draw();
        pictures[4] = new Picture(columnToX(20), rowToY(10), "recourses/Pizza.png");
        pictures[4].draw();
        pictures[5] = new Picture(columnToX(16), rowToY(8), "recourses/Pizza.png");
        pictures[5].draw();
        pictures[6] = new Picture(columnToX(25), rowToY(9), "recourses/Pizza.png");
        pictures[6].draw();
        pictures[7] = new Picture(columnToX(42), rowToY(19), "recourses/Pizza.png");
        pictures[7].draw();
        pictures[8] = new Picture(columnToX(18), rowToY(4), "recourses/Pizza.png");
        pictures[8].draw();
        pictures[9] = new Picture(columnToX(20), rowToY(16), "recourses/Pizza.png");
        pictures[9].draw();
        pictures[10] = new Picture(columnToX(41), rowToY(12), "recourses/Pizza.png");
        pictures[10].draw();
        pictures[11] = new Picture(columnToX(18), rowToY(16), "recourses/Pizza.png");
        pictures[11].draw();
        pictures[12] = new Picture(columnToX(40), rowToY(9), "recourses/Pizza.png");
        pictures[12].draw();
        pictures[13] = new Picture(columnToX(28), rowToY(10), "recourses/Beer.png");
        pictures[13].draw();
        pictures[14] = new Picture(columnToX(30), rowToY(12), "recourses/Beer.png");
        pictures[14].draw();
        pictures[15] = new Picture(columnToX(25), rowToY(16), "recourses/Beer.png");
        pictures[15].draw();
        pictures[16] = new Picture(columnToX(29), rowToY(19), "recourses/Beer.png");
        pictures[16].draw();
        pictures[17] = new Picture(columnToX(30), rowToY(20), "recourses/Beer.png");
        pictures[17].draw();
        pictures[18] = new Picture(columnToX(1), rowToY(1), "recourses/Beer.png");
        pictures[18].draw();
        pictures[19] = new Picture(columnToX(5), rowToY(15), "recourses/Beer.png");
        pictures[19].draw();
        pictures[20] = new Picture(columnToX(45), rowToY(0), "recourses/Beer.png");
        pictures[20].draw();
        pictures[21] = new Picture(columnToX(45), rowToY(5), "recourses/Beer.png");
        pictures[21].draw();
        pictures[22] = new Picture(columnToX(45), rowToY(10), "recourses/Beer.png");
        pictures[22].draw();
        pictures[23] = new Picture(columnToX(15), rowToY(10), "recourses/Beer.png");
        pictures[23].draw();
        pictures[24] = new Picture(columnToX(40), rowToY(20), "recourses/Beer.png");
        pictures[24].draw();
        pictures[25] = new Picture(columnToX(35), rowToY(20), "recourses/Beer.png");
        pictures[25].draw();
        pictures[26] = new Picture(columnToX(20), rowToY(12), "recourses/Beer.png");
        pictures[26].draw();
        pictures[27] = new Picture(columnToX(5), rowToY(18), "recourses/Beer.png");
        pictures[27].draw();
        pictures[28] = new Picture(columnToX(25), rowToY(10), "recourses/Beer.png");
        pictures[28].draw();
        pictures[29] = new Picture(columnToX(18), rowToY(10), "recourses/Beer.png");
        pictures[29].draw();
        pictures[30] = new Picture(columnToX(42), rowToY(12), "recourses/Beer.png");
        pictures[30].draw();
        pictures[31] = new Picture(columnToX(35), rowToY(20), "recourses/Beer.png");
        pictures[31].draw();
        pictures[32] = new Picture(columnToX(29), rowToY(19), "recourses/Beer.png");
        pictures[32].draw();
        pictures[33] = new Picture(columnToX(30), rowToY(20), "recourses/Beer.png");
        pictures[33].draw();
        pictures[34] = new Picture(columnToX(1), rowToY(10), "recourses/Beer.png");
        pictures[34].draw();
        pictures[35] = new Picture(columnToX(36), rowToY(15), "recourses/Beer.png");
        pictures[35].draw();
        pictures[36] = new Picture(columnToX(32), rowToY(2), "recourses/Beer.png");
        pictures[36].draw();
        pictures[37] = new Picture(columnToX(4), rowToY(2), "recourses/Beer.png");
        pictures[37].draw();
        pictures[38] = new Picture(columnToX(8), rowToY(17), "recourses/Beer.png");
        pictures[38].draw();
        pictures[39] = new Picture(columnToX(18), rowToY(9), "recourses/Beer.png");
        pictures[39].draw();
        pictures[40] = new Picture(columnToX(14), rowToY(18), "recourses/Beer.png");
        pictures[40].draw();
        pictures[41] = new Picture(columnToX(18), rowToY(15), "recourses/Beer.png");
        pictures[41].draw();
        pictures[42] = new Picture(columnToX(12), rowToY(10), "recourses/Beer.png");
        pictures[42].draw();
        pictures[43] = new Picture(columnToX(12), rowToY(10), "recourses/Beer.png");
        pictures[43].draw();


    }

    @Override
    public int getCols() {
        return this.cols;
    }

    @Override
    public int getRows() {
        return this.rows;
    }

    public Position makeGridPosition(String str) {
        return new PositionImpl(this, str);
    }

    @Override
    public Position makeGridPosition(int col, int row) {
        return new PositionImpl(col, row, this);
    }



    public int rowToY(int row) {
        return PADDING + (cellSize * row);
    }

    public int columnToX(int column) {
        return PADDING + (cellSize * column);
    }

    public int xToColumn(int x) {
        return (x / cellSize);
    }

    public int yToRow(int y) {
        return (y / cellSize);
    }

    public Picture[] getPictures() {
        return pictures;
    }


    public boolean hasCollided(Player player) {


        for (int i = 0; i < pictures.length; i++) {

            if (player.getPos().getRow() == yToRow(this.pictures[i].getY()) && player.getPos().getCol() == xToColumn(this.pictures[i].getX())) {

                pictures[i].delete();

                pictures[i].translate(-100, -100);

                for (int j = 0; j < 13; j++) {

                    if (this.pictures[i].equals(pictures[j])) {

                        if (!player.isCheck()) {

                            player.setScore(player.getScore() + 9);

                            player.setCheck(true);
                        } else {


                            player.setScore(player.getScore() + 10);
                        }

                        score2.delete();
                        score1.delete();

                        score1.setText(String.valueOf(Game.player1.getScore()));
                        score2.setText(String.valueOf(Game.player2.getScore()));

                        score2.draw();
                        score1.draw();

                    }
                }


                for (int a = 13; a < pictures.length; a++) {

                    if (pictures[i].equals(pictures[a])) {

                        if (!player.isCheck()) {

                            player.setScore(player.getScore() - 6);
                            player.setCheck(true);
                        } else {

                            player.setScore(player.getScore() - 5);
                        }

                        score2.delete();
                        score1.delete();

                        score1.setText(String.valueOf(Game.player1.getScore()));
                        score2.setText(String.valueOf(Game.player2.getScore()));

                        score2.draw();
                        score1.draw();

                        System.out.println(player.getScore());
                        if (Game.player1.getScore() <= 0 || Game.player2.getScore() <= 0) {

                            if (player.equals(Game.player1)) {
                                score1.delete();
                                score2.delete();
                                Game.gameOverFinish("Rolo has won");
                            } else {
                                score1.delete();
                                score2.delete();
                                Game.gameOverFinish("Paulinho has won");
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

}
