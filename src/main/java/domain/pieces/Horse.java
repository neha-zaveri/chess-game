package domain.pieces;

import domain.Board;
import domain.Cell;
import domain.Piece;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Piece {

    @Override
    public List<String> getPossibleMoves(Board board, Cell currentCell) {
        int currentXPos = currentCell.getRowIndex();
        int currentYPos = currentCell.getColumnIndex();
        Cell[][] cells = board.getCells();
        List<Cell> possibleMoves = new ArrayList<>();
        for (int i = 1; i < cells.length; i++) {
            possibleMoves.add(board.getCellByIndex(currentXPos + (2 * i), currentYPos + i));
            possibleMoves.add(board.getCellByIndex(currentXPos + (2 * i), currentYPos - i));
            possibleMoves.add(board.getCellByIndex(currentXPos - (2 * i), currentYPos + i));
            possibleMoves.add(board.getCellByIndex(currentXPos - (2 * i), currentYPos - i));
        }
        return getPossibleCellNumbers(possibleMoves);
    }

}
