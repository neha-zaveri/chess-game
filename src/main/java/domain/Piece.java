package domain;

import domain.pieces.Bishop;
import domain.pieces.Horse;
import domain.pieces.King;
import domain.pieces.Pawn;
import domain.pieces.Queen;
import domain.pieces.Rook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Piece {
    public List<String> getPossibleMoves(Board board, Cell currentCell) {
        Cell[][] cells = board.getCells();
        return Arrays.stream(cells)
                .flatMap(Arrays::stream)
                .filter(cell -> !cell.getCellNumber().equals(currentCell.getCellNumber()))
                .filter(cell -> isValidMove(cell, currentCell))
                .map(Cell::getCellNumber)
                .distinct()
                .collect(Collectors.toList());
    }

    public abstract boolean isValidMove(Cell cell, Cell currentCell);

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
