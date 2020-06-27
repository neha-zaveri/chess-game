package domain.pieces;

import domain.Board;
import domain.Cell;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PawnTest {
    @Test
    public void getPossibleMovesExtremeLeft() {
        Pawn pawn = new Pawn();
        List<String> possibleMoves = pawn.getPossibleMoves(new Board().getCells(), new Cell(0, 0, "A1"));
        assertEquals(2, possibleMoves.size());
        assertEquals("B1,B2", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesExtremeRight() {
        Pawn pawn = new Pawn();
        List<String> possibleMoves = pawn.getPossibleMoves(new Board().getCells(), new Cell(7, 7, "H8"));
        assertEquals(0, possibleMoves.size());
    }

    @Test
    public void getPossibleMovesExtremeLeftTop(){
        Pawn pawn = new Pawn();
        List<String> possibleMoves = pawn.getPossibleMoves(new Board().getCells(), new Cell(7, 0, "H1"));
        assertEquals(0, possibleMoves.size());
    }

    @Test
    public void getPossibleMovesExtremeRightBottom(){
        Pawn pawn = new Pawn();
        List<String> possibleMoves = pawn.getPossibleMoves(new Board().getCells(), new Cell(0, 7, "A8"));
        assertEquals(1, possibleMoves.size());
        assertEquals("B8", possibleMoves.get(0));
    }

    @Test
    public void getPossibleMovesForCenter() {
        Pawn pawn = new Pawn();
        List<String> possibleMoves = pawn.getPossibleMoves(new Board().getCells(), new Cell(3, 4, "D5"));
        assertEquals(2, possibleMoves.size());
        assertEquals("E5,E6", String.join(",", possibleMoves));
    }
}
