package domain;

public enum Direction {

    HORIZONTAL(new int[]{1, -1}, new int[]{0,0}),
    VERTICAL(new int[]{0,0}, new int[]{1, -1}),
    DIAGONAL(new int[]{1, 1, -1, -1}, new int[]{1, -1, 1, -1});

    private int[] x;
    private int[] y;

    Direction(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    public int[] getX() {
        return x;
    }

    public int[] getY() {
        return y;
    }
}
