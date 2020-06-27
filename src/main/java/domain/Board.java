package domain;

public class Board {
    private Spot[][] boardCells;
    private int size;

    public Board() {
    }

    public Board(int size) {
        this.size = size;
    }

    public Spot[][] getBoardCells() {
        return boardCells;
    }

    public Spot getCell(int x, int y) throws Exception {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }

        return boardCells[x][y];
    }

    public void initialiseBoard() {
        boardCells = new Spot[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char positionIndex = (char) (i + 65);
                String position = String.valueOf(positionIndex).concat(String.valueOf(j + 1));
                boardCells[i][j] = new Spot(i, j, position, null);
            }
        }
    }
}
