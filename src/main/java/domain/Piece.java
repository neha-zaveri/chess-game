package domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class Piece {
    public abstract List<String> getPossibleMoves(Board board, Cell currentCell);

    public List<String> getPossibleCellNumbers(List<Cell> possibleMoves) {
        return possibleMoves.stream()
                .filter(Objects::nonNull)
                .map(Cell::getCellNumber)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
