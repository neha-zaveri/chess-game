package domain.pieces;

import domain.Direction;
import domain.Piece;

import java.util.Arrays;
import java.util.List;

public class King extends Piece {
    @Override
    public List<Direction> getAllowedMovementDirection() {
        return Arrays.asList(Direction.DIAGONAL, Direction.HORIZONTAL, Direction.VERTICAL);
    }

    @Override
    public int getNoOfStepsAllowedAtATime() {
        return 1;
    }
}
