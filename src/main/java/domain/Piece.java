package domain;

import java.util.List;

public abstract class Piece {
    private List<Direction> allowedMovementDirection;
    private int noOfStepsAllowedAtATime;

    public abstract List<Direction> getAllowedMovementDirection() ;

    public abstract int getNoOfStepsAllowedAtATime();
}
