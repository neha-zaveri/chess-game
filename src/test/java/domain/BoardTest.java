package domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BoardTest {
    @Test
    public void shouldInitialiseBoardForSize8() {
        Board board = new Board();
        Cell[][] boardCells = board.getCells();
        assertEquals(8, boardCells.length);
        Cell cell = boardCells[7][7];
        assertNotNull(cell);
        assertEquals("H8", cell.getPosition());

        cell = boardCells[0][0];
        assertEquals("A1", cell.getPosition());
    }

    @Test
    public void shouldGetSpotBasedOnPosition() throws Exception {
        Board board = new Board();
        Cell cell = board.getSpot("D5");
        assertEquals(3, cell.getX());
        assertEquals(4, cell.getY());
    }
}