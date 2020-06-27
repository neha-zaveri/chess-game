package domain;

public class Spot {
    private int x;
    private int y;
    private String position;
    private Piece piece;

    public Spot(int x, int y, String position, Piece piece) {
        this.x = x;
        this.y = y;
        this.position = position;
        this.piece = piece;
    }

    public Spot(Piece piece, String position) {
        this.x = position.charAt(0) - 65;
        this.y = position.charAt(1) - 49;
        this.position = position;
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getPosition() {
        return position;
    }

    public Piece getPiece() {
        return piece;
    }
}
