package Lab2.ProblemB;

public class Queen extends Piece {
    public Queen(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isWithinBounds(b)) return false;
        return (a.getRow() == b.getRow() || a.getCol() == b.getCol()) || 
               (Math.abs(a.getRow() - b.getRow()) == Math.abs(a.getCol() - b.getCol()));
    }
}

