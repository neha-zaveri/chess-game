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
