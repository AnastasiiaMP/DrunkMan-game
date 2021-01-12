package org.academiadecodigo.offstrings.drunkman.grid;

import org.academiadecodigo.offstrings.drunkman.grid.position.Position;
import org.academiadecodigo.offstrings.drunkman.players.Player;

public interface Grid {

    void init();

    int getCols();

    int getRows();

    Position makeGridPosition(String s);

    Position makeGridPosition(int col, int row);

    boolean hasCollided(Player player);
}
