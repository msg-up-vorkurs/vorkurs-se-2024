package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task.Board;

public class BoardTest {

    @Test
    void testCheckIfMoveIsValid_validMove() {
        // given
        Board board = new Board();
        Move move = new Move('X', 0, 0);

        // when
        boolean valid = board.isMoveValid(move);

        // then
        Assertions.assertTrue(valid);
    }

    @Test
    void testCheckIfMoveIsValid_invalidMove() {
        // given
        Board board = new Board(new char[][]{
                {'O', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        });
        Move move = new Move('X', 0, 0);

        // when
        boolean valid = board.isMoveValid(move);

        // then
        Assertions.assertFalse(valid);
    }

    @Test
    void testPerformMove_playerX() {
        // given
        Board board = new Board();
        Move move = new Move('X', 0, 2);

        // when
        board.performMove(move);

        // then
        Assertions.assertArrayEquals(new char[]{' ', ' ', 'X'}, board.getBoard()[0]);
    }

    @Test
    void testPerformMove_playerO() {
        // given
        Board board = new Board();
        Move move = new Move('O', 0, 2);

        // when
        board.performMove(move);

        // then
        Assertions.assertArrayEquals(new char[]{' ', ' ', 'O'}, board.getBoard()[0]);
    }

    @Test
    void testBoardIsFull_fullBoard() {
        // given
        Board board = new Board(new char[][]{
                {'O', 'O', 'O'},
                {'O', 'O', 'O'},
                {'O', 'O', 'O'}
        });

        // when
        boolean full = board.isBoardFull();

        // then
        Assertions.assertTrue(full);
    }

    @Test
    void testBoardIsFull_notFullBoard() {
        // given
        Board board = new Board(new char[][]{
                {'O', 'O', 'O'},
                {'O', ' ', 'O'},
                {'O', 'O', 'O'}
        });

        // when
        boolean full = board.isBoardFull();

        // then
        Assertions.assertFalse(full);
    }

    @Test
    void testGameIsWon_emptyBoard() {
        // given
        Board board = new Board();

        // when
        boolean won = board.isGameWon();

        // then
        Assertions.assertFalse(won);
    }

    @Test
    void testGameIsWon_winInRow1() {
        // given
        Board board = new Board(new char[][]{
                {'O', 'O', 'O'},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        });

        // when
        boolean won = board.isGameWon();
        char winner = board.getWinner();

        // then
        Assertions.assertTrue(won);
        Assertions.assertEquals('O', winner);
    }

    @Test
    void testGameIsWon_winInRow2() {
        // given
        Board board = new Board(new char[][]{
                {' ', ' ', ' '},
                {'O', 'O', 'O'},
                {' ', ' ', ' '}
        });

        // when
        boolean won = board.isGameWon();
        char winner = board.getWinner();

        // then
        Assertions.assertTrue(won);
        Assertions.assertEquals('O', winner);
    }

    @Test
    void testGameIsWon_winInRow3() {
        // given
        Board board = new Board(new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'O', 'O', 'O'}
        });

        // when
        boolean won = board.isGameWon();
        char winner = board.getWinner();

        // then
        Assertions.assertTrue(won);
        Assertions.assertEquals('O', winner);
    }

    @Test
    void testGameIsWon_winInColumn1() {
        // given
        Board board = new Board(new char[][]{
                {'O', ' ', ' '},
                {'O', ' ', ' '},
                {'O', ' ', ' '}
        });

        // when
        boolean won = board.isGameWon();
        char winner = board.getWinner();

        // then
        Assertions.assertTrue(won);
        Assertions.assertEquals('O', winner);
    }

    @Test
    void testGameIsWon_winInColumn2() {
        // given
        Board board = new Board(new char[][]{
                {' ', 'O', ' '},
                {' ', 'O', ' '},
                {' ', 'O', ' '}
        });

        // when
        boolean won = board.isGameWon();
        char winner = board.getWinner();

        // then
        Assertions.assertTrue(won);
        Assertions.assertEquals('O', winner);
    }

    @Test
    void testGameIsWon_winInColumn3() {
        // given
        Board board = new Board(new char[][]{
                {' ', ' ', 'O'},
                {' ', ' ', 'O'},
                {' ', ' ', 'O'}
        });

        // when
        boolean won = board.isGameWon();
        char winner = board.getWinner();

        // then
        Assertions.assertTrue(won);
        Assertions.assertEquals('O', winner);
    }

    @Test
    void testGameIsWon_winInDiagonal1() {
        // given
        Board board = new Board(new char[][]{
                {'O', ' ', ' '},
                {' ', 'O', ' '},
                {' ', ' ', 'O'}
        });

        // when
        boolean won = board.isGameWon();
        char winner = board.getWinner();

        // then
        Assertions.assertTrue(won);
        Assertions.assertEquals('O', winner);
    }

    @Test
    void testGameIsWon_winInDiagonal2() {
        // given
        Board board = new Board(new char[][]{
                {' ', ' ', 'O'},
                {' ', 'O', ' '},
                {'O', ' ', ' '}
        });

        // when
        boolean won = board.isGameWon();
        char winner = board.getWinner();

        // then
        Assertions.assertTrue(won);
        Assertions.assertEquals('O', winner);
    }

    @Test
    void testGameIsWon_noWinInDiagonal() {
        // given
        Board board = new Board(new char[][]{
                {' ', ' ', 'O'},
                {' ', 'X', ' '},
                {'O', ' ', ' '}
        });

        // when
        boolean won = board.isGameWon();

        // then
        Assertions.assertFalse(won);
    }

    @Test
    void testGameIsWon_noWinInRow() {
        // given
        Board board = new Board(new char[][]{
                {'X', 'O', 'O'},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        });

        // when
        boolean won = board.isGameWon();

        // then
        Assertions.assertFalse(won);
    }

    @Test
    void testGameIsWon_noWinInColumn() {
        // given
        Board board = new Board(new char[][]{
                {'X', ' ', ' '},
                {'O', ' ', ' '},
                {'O', ' ', ' '}
        });

        // when
        boolean won = board.isGameWon();

        // then
        Assertions.assertFalse(won);
    }


}

