package domain.pieces;

import domain.Board;
import domain.Cell;
import domain.Piece;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    @Override
    public List<String> getPossibleMoves(Board board, Cell currentCell) {
        int xIndexOfCurrentCell = currentCell.getX();
        int yIndexOfCurrentCell = currentCell.getY();
        List<Cell> allowedCells = new ArrayList<>();
        Cell[][] cells = board.getCells();
        for (int i = 1; i < cells.length; i++) {
            allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell + i, yIndexOfCurrentCell + i));
            allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell - i, yIndexOfCurrentCell - i));
            allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell - i, yIndexOfCurrentCell + i));
            allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell + i, yIndexOfCurrentCell - i));
        }
        return getPossibleCellNumbers(allowedCells);
    }
}
