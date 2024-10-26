package Lab2.ProblemB;

public class Rook extends Piece 
{
    public Rook(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isWithinBounds(b)) return false;
        return a.getRow() == b.getRow() || a.getCol() == b.getCol();
    }
}
