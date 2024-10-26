package Lab2.ProblemB;

public class ChessTest {
    public static void main(String[] args) {
        Piece rook = new Rook(new Position(0, 0));
        System.out.println("Rook move valid? " + rook.isLegalMove(new Position(0, 5))); // true

        Piece bishop = new Bishop(new Position(2, 0));
        System.out.println("Bishop move valid? " + bishop.isLegalMove(new Position(5, 3))); // true

        Piece queen = new Queen(new Position(3, 3));
        System.out.println("Queen move valid? " + queen.isLegalMove(new Position(3, 7))); // true

        Piece knight = new Knight(new Position(4, 4));
        System.out.println("Knight move valid? " + knight.isLegalMove(new Position(6, 5))); // true

        Piece king = new King(new Position(5, 5));
        System.out.println("King move valid? " + king.isLegalMove(new Position(6, 6))); // true

        Piece pawn = new Pawn(new Position(1, 0), true);
        System.out.println("Pawn move valid? " + pawn.isLegalMove(new Position(3, 0))); // true
    }
}
