package domain.pieces;

import domain.Cell;
import domain.Piece;

public class Horse extends Piece {

    @Override
    public boolean isValidMove(Cell cell, Cell currentCell) {
        int rowIndexDiff = Math.abs(cell.getRowIndex() - currentCell.getRowIndex());
        int colIndexDiff = Math.abs(cell.getColumnIndex() - currentCell.getColumnIndex());
        return rowIndexDiff == colIndexDiff * 2;
    }

}
