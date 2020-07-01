package domain;

import java.util.ArrayList;
import java.util.List;


public class Moves {
    public static List<Cell> diagonal(Board board, int xIndexOfCurrentCell, int yIndexOfCurrentCell,
                                      Direction direction, int stepNo) {
        List<Cell> allowedDiagonalMoves = new ArrayList<>();
        allowedDiagonalMoves.add(board.getCellByIndex(xIndexOfCurrentCell + stepNo,
                yIndexOfCurrentCell + stepNo));
        allowedDiagonalMoves.add(board.getCellByIndex(xIndexOfCurrentCell + stepNo,
                yIndexOfCurrentCell - stepNo));
        if (direction == Direction.FORWARD) {
            return allowedDiagonalMoves;
        }
        allowedDiagonalMoves.add(board.getCellByIndex(xIndexOfCurrentCell - stepNo,
                yIndexOfCurrentCell + stepNo));
        allowedDiagonalMoves.add(board.getCellByIndex(xIndexOfCurrentCell - stepNo,
                yIndexOfCurrentCell - stepNo));
        return allowedDiagonalMoves;
    }

    public static List<Cell> vertical(Board board, int xIndexOfCurrentCell, int yIndexOfCurrentCell,
                                      Direction direction) {
        List<Cell> allowedVerticalMoves = new ArrayList<>();
        allowedVerticalMoves.add(board.getCellByIndex(xIndexOfCurrentCell + 1, yIndexOfCurrentCell));
        if (direction == Direction.FORWARD) {
            return allowedVerticalMoves;
        }
        allowedVerticalMoves.add(board.getCellByIndex(xIndexOfCurrentCell - 1, yIndexOfCurrentCell));
        return allowedVerticalMoves;
    }

    public static List<Cell> horizontal(Board board, int xIndexOfCurrentCell, int yIndexOfCurrentCell) {
        List<Cell> allowedVerticalMoves = new ArrayList<>();
        allowedVerticalMoves.add(board.getCellByIndex(xIndexOfCurrentCell, yIndexOfCurrentCell + 1));
        allowedVerticalMoves.add(board.getCellByIndex(xIndexOfCurrentCell, yIndexOfCurrentCell - 1));
        return allowedVerticalMoves;
    }

    public enum Direction {
        FORWARD,
        ALL
    }
}
