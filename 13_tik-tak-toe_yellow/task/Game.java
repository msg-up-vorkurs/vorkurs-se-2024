package task;

import utils.InputReader;
import utils.Move;

public class Game {

    private InputReader inputReader = new InputReader();

    private Board board = new Board();
    private char activePlayer = 'X';

    // TODO
    private boolean gameContinues() {
        return false;
    }

    // TODO
    private void printEndingMessage() {}

    private void printWelcomeMessage() {
        System.out.println("Tik-Tak-Toe");
        System.out.println("Für die Spielzüge nach der Aufforderung die Koordinaten des Feldes eingeben.");
        System.out.println("Die Koordinaten sind mit einem Komma getrennt im Format '[Zeilenindex],[Spaltenindex]' einzugeben.");
    }

    // TODO
    private void switchPlayer() {}

    // TODO
    public void startGame() {}

    public static void main(String[] args) {
//        task.Game game = new task.Game(new char[][]{
//                {' ', 'X', ' '},
//                {' ', ' ', 'O'},
//                {' ', 'X', ' '}
//        });
        Game game = new Game();
        game.startGame();
    }
}
