package domain;

public class Cell {
    private int x;
    private int y;
    private String cellNumber;
    private Piece piece;

    public Cell(int x, int y, String cellNumber) {
        this.x = x;
        this.y = y;
        this.cellNumber = cellNumber;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
