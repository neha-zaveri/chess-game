package domain.pieces;

import domain.Board;
import domain.Cell;
import domain.Moves;
import domain.Piece;

import java.util.ArrayList;
import java.util.List;

import static domain.Moves.Direction.ALL;

public class Bishop extends Piece {
    @Override
    public List<String> getPossibleMoves(Board board, Cell currentCell) {
        int xIndexOfCurrentCell = currentCell.getRowIndex();
        int yIndexOfCurrentCell = currentCell.getColumnIndex();
        List<Cell> allowedCells = new ArrayList<>();
        Cell[][] cells = board.getCells();
        for (int stepNo = 1; stepNo < cells.length; stepNo++) {
            allowedCells.addAll(Moves.diagonal(board, xIndexOfCurrentCell,yIndexOfCurrentCell, ALL, stepNo));
        }
        return getPossibleCellNumbers(allowedCells);
    }
}
