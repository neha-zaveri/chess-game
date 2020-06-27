package domain;

import java.util.Arrays;

public class Board {
    private Cell[][] cells;
    private int size = 8;

    public Board() {
        this.initialiseBoard();
    }

    public Cell[][] getCells() {
        return cells;
    }

    private void initialiseBoard() {
        cells = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char positionIndex = (char) (i + 65);
                String position = String.valueOf(positionIndex).concat(String.valueOf(j + 1));
                cells[i][j] = new Cell(i, j, position);
            }
        }
    }

    public Cell getSpot(String position) throws Exception {
        return Arrays.stream(cells)
                .flatMap(Arrays::stream)
                .filter(cell -> cell.getPosition().equalsIgnoreCase(position))
                .findFirst()
                .orElseThrow(() -> new Exception("Spot not found"));
    }
}
