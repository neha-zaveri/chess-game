package domain.pieces;

import domain.Board;
import domain.Cell;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RookTest {
    @Test
    public void getPossibleMovesExtremeLeft() {
        Rook rook = new Rook();
        List<String> possibleMoves = rook.getPossibleMoves(new Board(), new Cell(0, 0, "A1"));
        assertEquals(14, possibleMoves.size());
        assertEquals("A2,A3,A4,A5,A6,A7,A8,B1,C1,D1,E1,F1,G1,H1", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesExtremeRight() {
        Rook rook = new Rook();
        List<String> possibleMoves = rook.getPossibleMoves(new Board(), new Cell(7, 7, "H8"));
        assertEquals(14, possibleMoves.size());
    }

    @Test
    public void getPossibleMovesExtremeLeftTop() {
        Rook rook = new Rook();
        List<String> possibleMoves = rook.getPossibleMoves(new Board(), new Cell(7, 0, "H1"));
        assertEquals(14, possibleMoves.size());
        assertEquals("A1,B1,C1,D1,E1,F1,G1,H2,H3,H4,H5,H6,H7,H8", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesExtremeRightBottom() {
        Rook rook = new Rook();
        List<String> possibleMoves = rook.getPossibleMoves(new Board(), new Cell(0, 7, "A8"));
        assertEquals(14, possibleMoves.size());
        assertEquals("A1,A2,A3,A4,A5,A6,A7,B8,C8,D8,E8,F8,G8,H8", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesForCenter() {
        Rook rook = new Rook();
        List<String> possibleMoves = rook.getPossibleMoves(new Board(), new Cell(3, 4, "D5"));
        assertEquals(14, possibleMoves.size());
        assertEquals("A5,B5,C5,D1,D2,D3,D4,D6,D7,D8,E5,F5,G5,H5", String.join(",", possibleMoves));
    }

}