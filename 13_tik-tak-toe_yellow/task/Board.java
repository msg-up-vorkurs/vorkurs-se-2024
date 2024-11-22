package task;

import utils.Move;

public class Board {

    private char[][] board;
    private char winner;

    // TODO
    public Board() {
        // replace with your implementation
    }

    // TODO
    public Board(char[][] board) {
        // replace with your implementation
    }

    public char[][] getBoard() {
        return this.board;
    }

    public char getWinner() {
        return this.winner;
    }

    // Überprüft, ob das Spielfeld die Dimensionen 3x3 besitzt
    private void checkBoardDimensions() {
        int requiredLength = 3;
        if (this.board.length != requiredLength) {
            throw new RuntimeException("task.Board dimensions are not the expected 3x3!");
        }

        for (char[] row : this.board) {
            if (row.length != requiredLength) {
                throw new RuntimeException("task.Board dimensions are not the expected 3x3!");
            }
        }
    }

    // Gibt das Spielfeld in der Konsole aus
    public void printBoard() {
        String divider = "---+---+---";
        for (int i = 0; i < this.board.length; i++) {
            String rowOutput = "";
            for (int j = 0; j < this.board[i].length; j++) {
                rowOutput = rowOutput + " " + this.board[i][j] + " ";
                if (j < this.board[i].length - 1) {
                    rowOutput = rowOutput + "|";
                }
            }
            System.out.println(rowOutput);
            if (i < this.board.length - 1) {
                System.out.println(divider);
            }
        }
    }

    // TODO
    private char[][] createEmptyBoard() {
        // replace with your implementation
        return new char[3][3];
    }

    // TODO
    public boolean isMoveValid(Move move) {
        return false;
    }

    // TODO
    public void performMove(Move move) {}

    // TODO
    public boolean isBoardFull() {
        return true;
    }

    public boolean isGameWon() {
        // überprüfe alle Zeilen, Spalten und Diagonalen auf ein gewonnenes Spiel
        return this.checkForWinInRows() || this.checkForWinInColumns() || this.checkForWinInDiagonals();
    }

    // TODO
    private boolean checkForWinInRows() {
       return false;
    }

    // TODO
    private boolean checkForWinInColumns() {
        return false;
    }

    // TODO
    private boolean checkForWinInDiagonals() {
        return false;
    }

}
