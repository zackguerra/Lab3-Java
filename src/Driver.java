import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        Pawn pawnw = new Pawn();
        Knight knightw = new Knight();
        Bishop bishopw = new Bishop();
        Rook rookw = new Rook();
        Queen queenw = new Queen();
        King kingw = new King();

        // blacks
        Pawn pawnb = new Pawn(false);
        Knight knightb = new Knight(false);
        Bishop bishopb = new Bishop(false);
        Rook rookb = new Rook(false);
        Queen queenb = new Queen(false);
        King kingb = new King(false);


        // 1. Create an ArrayList<Piece> to include all types of pieces.

        ArrayList<Piece> pieces = new ArrayList<>();
        // white pieces
        pieces.add(pawnw);
        pieces.add(knightw);
        pieces.add(bishopw);
        pieces.add(rookw);
        pieces.add(queenw);
        pieces.add(kingw);

        // black pieces
        pieces.add(pawnb);
        pieces.add(knightb);
        pieces.add(bishopb);
        pieces.add(rookb);
        pieces.add(queenb);
        pieces.add(kingb);

        System.out.println("\n2. Using for-each loop, call move() method on each Piece to print the moves.\n");
        for (Piece p : pieces){
            System.out.println(p.toString());
            p.Move();
        }

        // 3. Create the following Pawns,
        Pawn p1 = new Pawn();
        p1.setPromoted(true);
        p1.setValue(9);

        Pawn p2 = new Pawn();

        Pawn p3 = new Pawn();
        p3.setWhite(false);

        Pawn p4 = new Pawn();
        p4.setWhite(false);
        p4.setPromoted(true);
        p4.setValue(9);

        Pawn p5 = new Pawn();
        p5.setWhite(true);
        p5.setPromoted(true);
        p5.setValue(2);

        // all should return false



        System.out.println("\n4. Use equals() method to compare the following:\n");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));

    }
}
