package domain.pieces;

import domain.Board;
import domain.Cell;
import domain.Moves;
import domain.Moves.Direction;
import domain.Piece;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    @Override
    public List<String> getPossibleMoves(Board board, Cell currentCell) {
        int currentXPos = currentCell.getRowIndex();
        int currentYPos = currentCell.getColumnIndex();

        List<Cell> possibleMoves = new ArrayList<>();
        possibleMoves.addAll(Moves.vertical(board, currentXPos, currentYPos, Direction.FORWARD));
        if (isPiecePresent(board.getCellByIndex(currentXPos + 1, currentYPos + 1)))
            possibleMoves.addAll(Moves.diagonal(board, currentXPos, currentYPos, Direction.FORWARD, 1));
        return getPossibleCellNumbers(possibleMoves);
    }

    private boolean isPiecePresent(Cell cell) {
        return cell != null && cell.getPiece() != null;
    }

}
