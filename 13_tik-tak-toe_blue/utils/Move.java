package utils;

public class Move {

    private char player;
    private int rowIndex;
    private int columnIndex;

    public Move(char player, int rowIndex, int columnIndex) {
        this.player = player;
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public char getPlayer() {
        return player;
    }
}
