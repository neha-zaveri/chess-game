package domain.pieces;

import domain.Cell;
import domain.Piece;

public class Bishop extends Piece {
    @Override
    public boolean isValidMove(Cell cell, Cell currentCell) {
        int colAbs = Math.abs(currentCell.getColumnIndex() - cell.getColumnIndex());
        int rowAbs = Math.abs(currentCell.getRowIndex() - cell.getRowIndex());
        return rowAbs == colAbs;
    }
}
