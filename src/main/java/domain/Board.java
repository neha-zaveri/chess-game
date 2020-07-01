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

    public Cell getCellByIndex(int rowIndex, int colIndex) {
        if (rowIndex > -1 && rowIndex < size && colIndex > -1 && colIndex < size)
            return cells[rowIndex][colIndex];
        return null;
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
