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

    public void startGame() {
        this.printWelcomeMessage();

        while (this.gameContinues()) {
            this.board.printBoard();

            Move move = inputReader.requestMove(this.activePlayer);

            if (this.board.isMoveValid(move)) {
                this.board.performMove(move);
                this.switchPlayer();
            } else {
                System.out.println("Der Spielzug ist nicht erlaubt, das Feld ist bereits belegt.");
                System.out.println("Bitte gib einen anderen Spielzug ein. ");
            }
        }

        this.board.printBoard();
        this.printEndingMessage();
    }

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
