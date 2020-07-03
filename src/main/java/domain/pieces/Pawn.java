package domain.pieces;

import domain.Cell;
import domain.Piece;

public class Pawn extends Piece {
    @Override
    public boolean isValidMove(Cell cell, Cell currentCell) {
        return isVerticalMove(cell, currentCell) ||
                (isDiagonalMove(cell, currentCell) &&
                        isPiecePresent(cell));
    }

    private boolean isDiagonalMove(Cell cell, Cell currentCell) {
        int rowIndexDiff = cell.getRowIndex() - currentCell.getRowIndex();
        return rowIndexDiff == 1 && cell.getColumnIndex() - currentCell.getColumnIndex() == 1;
    }

    private boolean isVerticalMove(Cell cell, Cell currentCell) {
        return cell.getRowIndex() - currentCell.getRowIndex() == 1 &&
                cell.getColumnIndex() == currentCell.getColumnIndex();
    }

    private boolean isPiecePresent(Cell cell) {
        return cell != null && cell.getPiece() != null;
    }
}
