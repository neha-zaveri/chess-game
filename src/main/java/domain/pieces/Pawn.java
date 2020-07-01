package domain.pieces;

import domain.Board;
import domain.Cell;
import domain.Piece;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    @Override
    public List<String> getPossibleMoves(Board board, Cell currentCell) {
        int currentXPos = currentCell.getRowIndex();
        int currentYPos = currentCell.getColumnIndex();

        List<Cell> possibleMoves = new ArrayList<>();
        possibleMoves.add(board.getCellByIndex(currentXPos + 1, currentYPos));
        if (isPiecePresent(board.getCellByIndex(currentXPos + 1, currentYPos + 1)))
            possibleMoves.add(board.getCellByIndex(currentXPos + 1, currentYPos + 1));
        return getPossibleCellNumbers(possibleMoves);
    }

    private boolean isPiecePresent(Cell cell) {
        return cell != null && cell.getPiece() != null;
    }

}
