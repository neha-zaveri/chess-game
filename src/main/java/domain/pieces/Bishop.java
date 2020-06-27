package domain.pieces;

import domain.Cell;
import domain.Direction;
import domain.Piece;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Bishop extends Piece {
    @Override
    public List<String> getPossibleMoves(Cell[][] cells, Cell currentCell) {
        int xIndexOfCurrentCell = currentCell.getX();
        int yIndexOfCurrentCell = currentCell.getY();
        List<Cell> allowedCells = new ArrayList<>();
        for (int i = 1; i < cells.length; i++) {
            if (isValidMove(cells.length, xIndexOfCurrentCell + i, yIndexOfCurrentCell + i))
                allowedCells.add(cells[xIndexOfCurrentCell + i][yIndexOfCurrentCell + i]);
            if (isValidMove(cells.length, xIndexOfCurrentCell - i, yIndexOfCurrentCell - i))
                allowedCells.add(cells[xIndexOfCurrentCell - i][yIndexOfCurrentCell - i]);
            if (isValidMove(cells.length, xIndexOfCurrentCell - i, yIndexOfCurrentCell + i))
                allowedCells.add(cells[xIndexOfCurrentCell - i][yIndexOfCurrentCell + i]);
            if (isValidMove(cells.length, xIndexOfCurrentCell + i, yIndexOfCurrentCell - i))
                allowedCells.add(cells[xIndexOfCurrentCell + i][yIndexOfCurrentCell - i]);
        }
        return allowedCells.stream().map(Cell::getPosition)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }


}
