package Lab2.ProblemB;

public class King extends Piece {
    public King(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isWithinBounds(b)) return false;
        return Math.abs(a.getRow() - b.getRow()) <= 1 &&
               Math.abs(a.getCol() - b.getCol()) <= 1;
    }
}
