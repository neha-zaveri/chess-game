package domain.pieces;

import domain.Board;
import domain.Cell;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BishopTest {

    @Test
    public void getPossibleMovesExtremeLeft() {
        Bishop bishop = new Bishop();
        List<String> possibleMoves = bishop.getPossibleMoves(new Board().getCells(), new Cell(0, 0, "A1"));
        assertEquals(7, possibleMoves.size());
        assertEquals("B2,C3,D4,E5,F6,G7,H8", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesExtremeRight() {
        Bishop bishop = new Bishop();
        List<String> possibleMoves = bishop.getPossibleMoves(new Board().getCells(), new Cell(7, 7, "H8"));
        assertEquals(7, possibleMoves.size());
        assertEquals("A1,B2,C3,D4,E5,F6,G7", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesExtremeLeftTop(){
        Bishop bishop = new Bishop();
        List<String> possibleMoves = bishop.getPossibleMoves(new Board().getCells(), new Cell(7, 0, "H1"));
        assertEquals(7, possibleMoves.size());
        assertEquals("A8,B7,C6,D5,E4,F3,G2", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesExtremeRightBottom(){
        Bishop bishop = new Bishop();
        List<String> possibleMoves = bishop.getPossibleMoves(new Board().getCells(), new Cell(0, 7, "A8"));
        assertEquals(7, possibleMoves.size());
        assertEquals("B7,C6,D5,E4,F3,G2,H1", String.join(",", possibleMoves));
    }

    @Test
    public void getPossibleMovesForCenter() {
        Bishop bishop = new Bishop();
        List<String> possibleMoves = bishop.getPossibleMoves(new Board().getCells(), new Cell(3, 4, "D5"));
        assertEquals(13, possibleMoves.size());
        assertEquals("A2,A8,B3,B7,C4,C6,E4,E6,F3,F7,G2,G8,H1", String.join(",", possibleMoves));
    }

}