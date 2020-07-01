package domain;

import domain.pieces.Bishop;
import domain.pieces.Horse;
import domain.pieces.King;
import domain.pieces.Pawn;
import domain.pieces.Queen;
import domain.pieces.Rook;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class Piece {
    public abstract List<String> getPossibleMoves(Board board, Cell currentCell);

    public List<String> getPossibleCellNumbers(List<Cell> possibleMoves) {
        return possibleMoves.stream()
                .filter(Objects::nonNull)
                .map(Cell::getCellNumber)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static Piece createPieceByType(PieceType pieceType) throws Exception {
        switch (pieceType) {
            case KING:
                return new King();
            case PAWN:
                return new Pawn();
            case ROOK:
                return new Rook();
            case HORSE:
                return new Horse();
            case QUEEN:
                return new Queen();
            case BISHOP:
                return new Bishop();
            default:
                throw new Exception("Invalid Piece Type");
        }
    }
}
