package domain;

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
        for (int rowIndex = 0; rowIndex < size; rowIndex++) {
            for (int columnIndex = 0; columnIndex < size; columnIndex++) {
                char rowIndexInCharacter = (char) (rowIndex + 65);
                String position = String.valueOf(rowIndexInCharacter).concat(String.valueOf(columnIndex + 1));
                cells[rowIndex][columnIndex] = new Cell(rowIndex, columnIndex, position);
            }
        }
    }
}
