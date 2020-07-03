package domain;

public class Cell {
    private int rowIndex;
    private int columnIndex;
    private String cellNumber;
    private Piece piece;

    public Cell(int rowIndex, int columnIndex, String cellNumber) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        this.cellNumber = cellNumber;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }


}
