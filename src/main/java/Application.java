import domain.Board;
import domain.Piece;
import domain.PieceFactory;
import domain.PieceType;

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
                List<String> possibleMoves = piece.getPossibleMoves(board, board.getCellByCellNumber(inputValues[1]));
                System.out.println(String.join(",", possibleMoves));
            }
        }
    }
}

