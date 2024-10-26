package Lab2.ProblemB;

public class Pawn extends Piece {
    private boolean isWhite;

    public Pawn(Position a, boolean isWhite) {
        super(a);
        this.isWhite = isWhite;
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isWithinBounds(b)) return false;

        int direction = isWhite ? 1 : -1;  // White moves up, Black moves down
        int rowDiff = b.getRow() - a.getRow();
        int colDiff = Math.abs(b.getCol() - a.getCol());

        // Standard move: one step forward
        if (colDiff == 0 && rowDiff == direction) return true;

        // Two steps forward from the starting position
        if (colDiff == 0 && rowDiff == 2 * direction &&
            (isWhite && a.getRow() == 1 || !isWhite && a.getRow() == 6)) {
            return true;
        }

        // Capture move: one step diagonally forward
        return colDiff == 1 && rowDiff == direction;
    }
}
