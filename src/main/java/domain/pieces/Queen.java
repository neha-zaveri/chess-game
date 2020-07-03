package domain.pieces;

import domain.Cell;
import domain.Piece;

public class Queen extends Piece {
    @Override
    public boolean isValidMove(Cell cell, Cell currentCell) {
        return true;
    }
}
