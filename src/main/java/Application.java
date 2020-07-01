import domain.Board;
import domain.Cell;
import domain.Piece;
import domain.PieceFactory;
import domain.PieceType;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) throws Exception {
        if (args == null || args.length == 0) {
            System.out.println("Please provide input string");
        } else {
            String[] inputValues = args[0].split(" ");
            if (inputValues.length != 2) {
                System.out.println("Please provide piece type and cell number");
            } else {
                String pieceType = inputValues[0].toUpperCase();
                Piece piece = new PieceFactory().getPieceByType(PieceType.valueOf(pieceType));
                Board board = new Board();
                List<String> possibleMoves = piece.getPossibleMoves(board, getCellByCellNumber(board, inputValues[1]));
                System.out.println(String.join(",", possibleMoves));
            }
        }
    }

    private static Cell getCellByCellNumber(Board board, String cellNumber) throws Exception {
        return Arrays.stream(board.getCells())
                .flatMap(Arrays::stream)
                .filter(cell -> cell.getCellNumber().equalsIgnoreCase(cellNumber))
                .findFirst()
                .orElseThrow(() -> new Exception("Cell not found"));
    }
}

