package domain.pieces;

import domain.Board;
import domain.Cell;
import domain.Piece;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
    public List<String> getPossibleMoves(Board board, Cell currentCell) {
        int xIndexOfCurrentCell = currentCell.getX();
        int yIndexOfCurrentCell = currentCell.getY();
        List<Cell> allowedCells = new ArrayList<>();
        allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell + 1, yIndexOfCurrentCell + 1));
        allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell - 1, yIndexOfCurrentCell - 1));
        allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell - 1, yIndexOfCurrentCell + 1));
        allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell + 1, yIndexOfCurrentCell - 1));
        allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell + 1, yIndexOfCurrentCell));
        allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell - 1, yIndexOfCurrentCell));
        allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell, yIndexOfCurrentCell + 1));
        allowedCells.add(board.getCellByIndex(xIndexOfCurrentCell, yIndexOfCurrentCell - 1));
        return getPossibleCellNumbers(allowedCells);
    }
}
