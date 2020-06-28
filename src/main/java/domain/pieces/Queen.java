package domain.pieces;

import domain.Board;
import domain.Cell;
import domain.Piece;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Queen extends Piece {
    @Override
    public List<String> getPossibleMoves(Board board, Cell currentCell) {
        Cell[][] cells = board.getCells();
        return Arrays.stream(cells)
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .filter(cell -> !cell.getCellNumber().equalsIgnoreCase(currentCell.getCellNumber()))
                .map(Cell::getCellNumber)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

}
