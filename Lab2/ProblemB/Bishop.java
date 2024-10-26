package Lab2.ProblemB;

public class Bishop extends Piece 
{
    public Bishop(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isWithinBounds(b)) return false;
        return Math.abs(a.getRow() - b.getRow()) == Math.abs(a.getCol() - b.getCol());
    }
}
