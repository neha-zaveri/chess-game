package domain.pieces;

import domain.Cell;
import domain.Piece;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rook extends Piece {
    @Override
    public List<String> getPossibleMoves(Cell[][] cells, Cell currentCell) {
        int currentXPos = currentCell.getX();
        int currentYPos = currentCell.getY();
        List<Cell> allowedMoves = new ArrayList<>();
        for (int i = 1; i < cells.length; i++) {
            if (isValidMove(cells.length, currentXPos + i, currentYPos))
                allowedMoves.add(cells[currentXPos + i][currentYPos]);
            if (isValidMove(cells.length, currentXPos - i, currentYPos))
                allowedMoves.add(cells[currentXPos - i][currentYPos]);
            if (isValidMove(cells.length, currentXPos, currentYPos + i))
                allowedMoves.add(cells[currentXPos][currentYPos + i]);
            if (isValidMove(cells.length, currentXPos, currentYPos - i))
                allowedMoves.add(cells[currentXPos][currentYPos - i]);
        }
        return allowedMoves.stream().map(Cell::getPosition)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

}
