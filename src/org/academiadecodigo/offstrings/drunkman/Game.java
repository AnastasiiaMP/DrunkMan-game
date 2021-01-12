package org.academiadecodigo.offstrings.drunkman;

import org.academiadecodigo.offstrings.drunkman.grid.GridImpl;
import org.academiadecodigo.offstrings.drunkman.players.Character;
import org.academiadecodigo.offstrings.drunkman.players.PlayerOne;
import org.academiadecodigo.offstrings.drunkman.players.PlayerTwo;
import org.academiadecodigo.offstrings.drunkman.sound.Sound;
import org.academiadecodigo.offstrings.drunkman.walls.WallsFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game implements KeyboardHandler {

    public static PlayerOne player1;
    public static PlayerTwo player2;
    private static Text end;
    private static Rectangle gameOverPage;
    private GridImpl grid;
    private static boolean gameOver;
    private Keyboard keyboard;
    private Rectangle firstPage;
    private Text start;
    private Text startPress;
    private int counter;
    private Picture picBenny;
    private Picture picRolo;
    private Picture picPaulo;
    private Text nameBenny;
    private Text nameRolo;
    private Text namePaulo;
    private Text welcome;
    private int delay;
    private Picture pic;
    private Text pick;
    private static Sound theme;



    public Game(int cols, int rows, int delay) {

        grid = new GridImpl(cols, rows);
        this.delay = delay;
        keyboard = new Keyboard(this);
        counter = 1;
        player2 = new PlayerTwo(null);
        player1 = new PlayerOne(null);
    }


    public void init() {

        theme = new Sound("/recourses/mp.wav");
        theme.play(true);
        firstPage = new Rectangle(10, 10, 1500, 700);
        firstPage.setColor(Color.DARK_GRAY);
        firstPage.fill();
        start = new Text(550, 500, "Press <SPACE> to START");
        startPress = new Text(590, 550, "the game");
        welcome = new Text(550, 50, "Welcome to the DRUNK MAN!");
        pic = new Picture(870, 40, "recourses/Beer.png");
        pic.grow(10, 10);
        pic.draw();
        welcome.setColor(Color.YELLOW);
        start.setColor(Color.WHITE);
        startPress.setColor(Color.YELLOW);
        start.grow(160, 30);
        start.draw();
        startPress.grow(70, 20);
        startPress.draw();
        welcome.draw();
        welcome.grow(200, 30);
        pick = new Text(350, 100, "Dear Players, pick your characters. Press [1] to pick Benny, [2] - Rolo-Demon and [3] - Paulinho");
        pick.setColor(Color.WHITE);
        pick.grow(280, 15);
        pick.draw();
        picBenny = new Picture( 200, 150, "recourses/Benny.jpg");
        picBenny.draw();
        nameBenny = new Text (290, 370, Character.BENNY.getName());
        nameBenny.setColor(Color.RED);
        nameBenny.grow(30, 10);
        nameBenny.draw();
        picRolo = new Picture(500, 150, "recourses/Rolo.jpg");
        picRolo.draw();
        nameRolo = new Text(575, 370, Character.ROLO.getName());
        nameRolo.setColor(Color.RED);
        nameRolo.grow(45, 10);
        nameRolo.draw();
        picPaulo = new Picture(800, 150, "recourses/2.jpg");
        picPaulo.draw();
        namePaulo = new Text(885, 370, Character.PAULINHO.getName());
        namePaulo.setColor(Color.RED);
        namePaulo.grow(45, 10);
        namePaulo.draw();
        KeyboardEvent pressSpace = new KeyboardEvent();
        pressSpace.setKey(KeyboardEvent.KEY_SPACE);
        pressSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pressSpace);
        KeyboardEvent pressOne = new KeyboardEvent();
        pressOne.setKey(KeyboardEvent.KEY_1);
        pressOne.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(pressOne);
        KeyboardEvent pressTwo = new KeyboardEvent();
        pressTwo.setKey(KeyboardEvent.KEY_2);
        pressTwo.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(pressTwo);
        KeyboardEvent pressTree = new KeyboardEvent();
        pressTree.setKey(KeyboardEvent.KEY_3);
        pressTree.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(pressTree);

    }

    public void keyPressed(KeyboardEvent keyboardEvent) {


        if (counter > 0) {

            start.delete();
            firstPage.delete();
            startPress.delete();
            nameBenny.delete();
            namePaulo.delete();
            nameRolo.delete();
            picBenny.delete();
            picPaulo.delete();
            picRolo.delete();
            welcome.delete();
            pic.delete();
            pick.delete();

            grid.init();
            WallsFactory.getNewObject(grid);

            Text score1 = new Text(100, 20, "Score Paulinho :");
            score1.grow(80, 20);
            score1.setColor(Color.BLACK);
            score1.draw();

            Text score2 = new Text(1300, 20, "Score Rolo :");
            score2.grow(80, 20);
            score2.setColor(Color.BLACK);
            score2.draw();

            player1.setPos(grid.makeGridPosition("recourses/P.jpg"));
            player1.setGrid(grid);

            player2.setPos(grid.makeGridPosition("recourses/R.jpg"));
            player2.setGrid(grid);

            counter = 0;

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_1) {
            if (!player1.getPicked()) {
                player1.setCharacter(Character.BENNY);
                picBenny.delete();
                nameBenny.delete();
                player1.isPicked();
            } else {
                player2.setCharacter(Character.BENNY);
                picBenny.delete();
                nameBenny.delete();
                player2.isPicked();
            }
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_2) {
            if (!player1.getPicked()) {
                player1.setCharacter(Character.ROLO);
                picRolo.delete();
                nameRolo.delete();
                player1.isPicked();
            } else {
                player2.setCharacter(Character.ROLO);
                picRolo.delete();
                nameRolo.delete();
                player2.isPicked();
            }
        }
        if (keyboardEvent.getKey() == keyboardEvent.KEY_3) {
            if (!player1.getPicked()) {
                player1.setCharacter(Character.PAULINHO);
                picPaulo.delete();
                namePaulo.delete();
                player1.isPicked();
            } else {
                player2.setCharacter(Character.PAULINHO);
                picPaulo.delete();
                namePaulo.delete();
                player2.isPicked();
            }
        }
    }


    public void start() throws InterruptedException {

        while (true) {

            Thread.sleep(delay);
        }
    }


    public static void gameOverFinish(String name) {

        theme.stop();
        theme = new Sound("/recourses/smw_game_over.wav");
        theme.play(true);
        gameOver = true;
        gameOverPage = new Rectangle(10, 10, 1500, 750);
        gameOverPage.setColor(Color.LIGHT_GRAY);
        gameOverPage.fill();
        Text winner = new Text(750, 500, name + "!!!");
        winner.setColor(Color.BLUE);
        winner.draw();
        winner.grow(80, 30);
        end = new Text(750, 250, "GAME OVER");
        end.setColor(Color.BLUE);
        end.draw();
        end.grow(100, 30);

    }
}





