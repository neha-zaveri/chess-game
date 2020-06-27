package domain.pieces;

import domain.Cell;
import domain.Direction;
import domain.Piece;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class King extends Piece {
    public List<Direction> getAllowedMovementDirection() {
        return Arrays.asList(Direction.DIAGONAL, Direction.HORIZONTAL, Direction.VERTICAL);
    }

    public List<String> getPossibleMoves(Cell[][] cells, Cell currentCell) {
        int xIndexOfCurrentCell = currentCell.getX();
        int yIndexOfCurrentCell = currentCell.getY();

        return getAllowedMovementDirection()
                .stream()
                .flatMap(direction -> {
                    int[] xValues = direction.getX();
                    int[] yValues = direction.getY();
                    return IntStream.range(0, xValues.length)
                            .mapToObj(i -> {
                                        int xPos = xValues[i] + xIndexOfCurrentCell;
                                        int yPos = yValues[i] + yIndexOfCurrentCell;
                                        if (isValidMove(cells.length, xPos, yPos))
                                            return cells[xPos][yPos];
                                        return null;
                                    }
                            );
                }).filter(Objects::nonNull)
                .map(Cell::getPosition)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
