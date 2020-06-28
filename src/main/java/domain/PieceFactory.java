package domain;

import domain.pieces.Bishop;
import domain.pieces.Horse;
import domain.pieces.King;
import domain.pieces.Pawn;
import domain.pieces.Queen;
import domain.pieces.Rook;

public class PieceFactory {
    public Piece getPieceByType(PieceType pieceType) throws Exception {
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
