package domain.pieces;

import domain.Cell;
import domain.Direction;
import domain.Piece;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pawn extends Piece {

    @Override
    public List<String> getPossibleMoves(Cell[][] cells, Cell currentCell) {
        int currentXPos = currentCell.getX();
        int currentYPos = currentCell.getY();

        List<Cell> possibleMoves = new ArrayList<>();
        if (isValidMove(cells.length, currentXPos + 1, currentYPos))
            possibleMoves.add(cells[currentXPos + 1][currentYPos]);
        if (isValidMove(cells.length, currentXPos + 1, currentYPos + 1))
            possibleMoves.add(cells[currentXPos + 1][currentYPos + 1]);

        return possibleMoves.stream()
                .map(Cell::getPosition)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

}
