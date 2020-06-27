import domain.Board;
import domain.pieces.King;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void getPossibleMoves() {
        Board board = new Board(8);
        Game game = new Game(board);
        Set<String> possibleMoves = game.getPossibleMoves(new King(), "D5");
        assertEquals(8, possibleMoves.stream().count());
    }
}
