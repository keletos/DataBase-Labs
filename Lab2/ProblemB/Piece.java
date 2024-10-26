package Lab2.ProblemB;

public abstract class Piece 
{
    protected Position a; 
    

    public Piece(Position a) {
        this.a = a;
    }

    public abstract boolean isLegalMove(Position b);

    protected boolean isWithinBounds(Position b) {
        return b.getRow() >= 0 && b.getRow() < 8 &&
               b.getCol() >= 0 && b.getCol() < 8;
    }
}
