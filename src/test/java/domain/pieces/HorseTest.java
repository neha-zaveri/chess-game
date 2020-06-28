package domain.pieces;

import domain.Board;
import domain.Cell;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HorseTest {
    @Test
    public void getPossibleMovesExtremeLeft() {
        Horse horse = new Horse();
        List<String> possibleMoves = horse.getPossibleMoves(new Board(), new Cell(0, 0, "A1"));
        assertEquals(3, possibleMoves.size());
        assertEquals("C2,E3,G4", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesExtremeRight() {
        Horse horse = new Horse();
        List<String> possibleMoves = horse.getPossibleMoves(new Board(), new Cell(7, 7, "H8"));
        assertEquals(3, possibleMoves.size());
        assertEquals("B5,D6,F7", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesExtremeLeftTop() {
        Horse horse = new Horse();
        List<String> possibleMoves = horse.getPossibleMoves(new Board(), new Cell(7, 0, "H1"));
        assertEquals(3, possibleMoves.size());
        assertEquals("B4,D3,F2", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesExtremeRightBottom() {
        Horse horse = new Horse();
        List<String> possibleMoves = horse.getPossibleMoves(new Board(), new Cell(0, 7, "A8"));
        assertEquals(3, possibleMoves.size());
        assertEquals("C7,E6,G5", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesForCenter() {
        Horse horse = new Horse();
        List<String> possibleMoves = horse.getPossibleMoves(new Board(), new Cell(3, 4, "D5"));
        assertEquals(6, possibleMoves.size());
        assertEquals("B4,B6,F4,F6,H3,H7", String.join(",", possibleMoves));
    }
}