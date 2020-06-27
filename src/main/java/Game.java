import domain.Board;
import domain.Direction;
import domain.Piece;
import domain.Spot;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public Set<String> getPossibleMoves(Piece piece, String position) {
        try {
            Spot spot = board.getSpot(position);
            Spot[][] boardCells = board.getBoardCells();
            List<Direction> allowedMovementDirection = piece.getAllowedMovementDirection();
            return allowedMovementDirection
                    .stream()
                    .flatMap(direction -> {
                        int[] xValues = direction.getX();
                        int[] yValues = direction.getY();
                        return IntStream.range(0, xValues.length)
                                .mapToObj(i -> boardCells[xValues[i] + spot.getX()][yValues[i] + spot.getY()]);
                    }).map(Spot::getPosition)
                    .collect(Collectors.toSet());


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

// Stream.concat(Arrays.stream(direction.getX())
////                                            .mapToObj(x -> boardCells[x + spot.getX()][spot.getY()]),
////                                    Arrays.stream(direction.getY()).mapToObj(y -> boardCells[spot.getX()][y +
// spot.getY()])))
