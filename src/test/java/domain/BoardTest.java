package domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class BoardTest {
    @Test
    public void shouldInitialiseTheBoardCorrectlyBasedOnSize() {
        Board board = new Board(1);
        board.initialiseBoard();
        Spot[][] boardCells = board.getBoardCells();
        assertEquals(1, boardCells.length);
        Spot spot = boardCells[0][0];
        assertNotNull(spot);
        assertEquals("A1", spot.getPosition());
        assertNull(spot.getPiece());
    }

    @Test
    public void shouldInitialiseBoardForSize8() {
        Board board = new Board(8);
        board.initialiseBoard();
        Spot[][] boardCells = board.getBoardCells();
        assertEquals(8, boardCells.length);
        Spot spot = boardCells[7][7];
        assertNotNull(spot);
        assertEquals("H8", spot.getPosition());
        assertNull(spot.getPiece());

        spot = boardCells[0][0];
        assertEquals("A1", spot.getPosition());
        assertNull(spot.getPiece());
    }
}