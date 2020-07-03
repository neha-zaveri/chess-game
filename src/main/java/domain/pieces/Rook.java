package domain.pieces;

import domain.Cell;
import domain.Piece;

public class Rook extends Piece {
    @Override
    public boolean isValidMove(Cell cell, Cell currentCell) {
        return cell.getRowIndex() == currentCell.getRowIndex() || cell.getColumnIndex() == currentCell.getColumnIndex();
    }

}
