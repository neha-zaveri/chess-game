package domain.pieces;

import domain.Board;
import domain.Cell;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class KingTest {
    @Test
    public void getPossibleMoves() {
        King king = new King();
        List<String> possibleMoves = king.getPossibleMoves(new Board(), new Cell(3, 4, "D5"));
        assertEquals("C4,C5,C6,D4,D6,E4,E5,E6", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesForExtremeLast() {
        King king = new King();
        List<String> possibleMoves = king.getPossibleMoves(new Board(), new Cell(7, 7, "H8"));
        assertEquals("G7,G8,H7", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesForFistPiece() {
        King king = new King();
        List<String> possibleMoves = king.getPossibleMoves(new Board(), new Cell(0, 0, "A0"));
        assertEquals("A2,B1,B2", String.join(",", possibleMoves));
    }

}