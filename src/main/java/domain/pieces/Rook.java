package domain.pieces;

import domain.Board;
import domain.Cell;
import domain.Piece;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {
    @Override
    public List<String> getPossibleMoves(Board board, Cell currentCell) {
        int currentXPos = currentCell.getX();
        int currentYPos = currentCell.getY();
        Cell[][] cells = board.getCells();
        List<Cell> allowedMoves = new ArrayList<>();
        for (int i = 1; i < cells.length; i++) {
            allowedMoves.add(board.getCellByIndex(currentXPos + i, currentYPos));
            allowedMoves.add(board.getCellByIndex(currentXPos - i, currentYPos));
            allowedMoves.add(board.getCellByIndex(currentXPos, currentYPos + i));
            allowedMoves.add(board.getCellByIndex(currentXPos, currentYPos - i));
        }
        return getPossibleCellNumbers(allowedMoves);
    }

}
