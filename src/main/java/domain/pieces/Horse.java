package domain.pieces;

import domain.Direction;
import domain.Piece;

import java.util.List;

public class Horse extends Piece {
    @Override
    public List<Direction> getAllowedMovementDirection() {
        return null;
    }

    @Override
    public int getNoOfStepsAllowedAtATime() {
        return 0;
    }
}
