package domain.pieces;

import domain.Cell;
import domain.Direction;
import domain.Piece;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Queen extends Piece {
    @Override
    public List<String> getPossibleMoves(Cell[][] cells, Cell currentCell) {
        return Arrays.stream(cells)
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .filter(cell -> !cell.getPosition().equalsIgnoreCase(currentCell.getPosition()))
                .map(Cell::getPosition)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

}
