package domain;

import java.util.List;

public abstract class Piece {
    public abstract List<String> getPossibleMoves(Cell[][] cells, Cell currentCell);

    public boolean isValidMove(int length, int xPos, int yPos) {
        return (xPos <= length - 1) && (yPos <= length - 1)
                && (xPos > -1) && (yPos > -1);
    }
}
