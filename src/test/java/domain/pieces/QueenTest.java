package domain.pieces;

import domain.Board;
import domain.Cell;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class QueenTest {

    @Test
    public void shouldAllowQueenInAllDirection() {
        Queen queen = new Queen();
        List<String> possibleMoves = queen.getPossibleMoves(new Board().getCells(), new Cell(0, 0, "A1"));
        assertFalse(possibleMoves.contains("A1"));
        assertEquals(63, possibleMoves.size());
    }

    @Test
    public void shouldAllowQueenInAllDirectionExtremeRightCorner() {
        Queen queen = new Queen();
        List<String> possibleMoves = queen.getPossibleMoves(new Board().getCells(), new Cell(7, 7, "H7"));
        assertFalse(possibleMoves.contains("H7"));
        assertEquals(63, possibleMoves.size());
    }

    @Test
    public void shouldAllowQueenInAllDirectionCenter() {
        Queen queen = new Queen();
        List<String> possibleMoves = queen.getPossibleMoves(new Board().getCells(), new Cell(3, 4, "D5"));
        assertFalse(possibleMoves.contains("D5"));
        assertEquals(63, possibleMoves.size());
    }

}