import domain.Board;
import domain.Piece;
import domain.Spot;

import java.util.List;

public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public List<Spot> getPossibleMoves(Piece piece, String position) {
        try {
            Spot spot = board.getSpot(position);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
