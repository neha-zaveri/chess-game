package domain.pieces;

import domain.Board;
import domain.Cell;
import domain.Moves;
import domain.Piece;

import java.util.ArrayList;
import java.util.List;

import static domain.Moves.Direction.ALL;

public class King extends Piece {
    public List<String> getPossibleMoves(Board board, Cell currentCell) {
        int xIndexOfCurrentCell = currentCell.getRowIndex();
        int yIndexOfCurrentCell = currentCell.getColumnIndex();
        List<Cell> allowedCells = new ArrayList<>();
        allowedCells.addAll(Moves.diagonal(board, xIndexOfCurrentCell, yIndexOfCurrentCell, ALL, 1));
        allowedCells.addAll(Moves.horizontal(board, xIndexOfCurrentCell, yIndexOfCurrentCell));
        allowedCells.addAll(Moves.vertical(board, xIndexOfCurrentCell, yIndexOfCurrentCell, ALL));
        return getPossibleCellNumbers(allowedCells);
    }
}
