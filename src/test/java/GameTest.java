import domain.Board;
import domain.Piece;
import org.junit.Test;

public class GameTest {

    @Test
    public void getPossibleMoves() {
        Board board = new Board(8);
        Game game = new Game(board);
        game.getPossibleMoves(new Piece(), "D5");
    }
}
