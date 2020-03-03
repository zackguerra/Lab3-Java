public class Pawn extends Piece {

    private boolean promoted = false;
    private Piece newPiece;

    public Pawn (){
        super(true,1);
    }
    public Pawn (boolean white){
        super(white,1);
    }


    public void promote(Piece newPiece) {
        if (promoted) {
            setValue(newPiece.getValue());
        }
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    @Override
    public void Move() {
        System.out.println("Forward 1");
    }

    @Override
    public boolean equals(Object o) {
        return super.getValue() == ((Piece)o).getValue() && ((Piece)o).isWhite() == super.isWhite() && this.isPromoted() == ((Pawn)o).isPromoted() && this.getNewPiece()== ((Pawn)o).getNewPiece();
    }

    @Override
    public String toString() {
        return "Pawn{value = "+ getValue() +"}";
    }

}
