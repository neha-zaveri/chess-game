package domain;

public class Cell {
    private int x;
    private int y;
    private String position;

    public Cell(int x, int y, String position) {
        this.x = x;
        this.y = y;
        this.position = position;
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
}
