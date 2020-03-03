public class Rook extends Piece {

    public Rook (){
        super(true, 5);
    }
    public Rook (boolean white){
        super(white,1);
    }
    @Override
    public void Move() {
        System.out.println("Horizontally or vertically");
    }
    @Override
    public String toString() {
        return "Rook{value = "+ getValue() +"}";
    }
}
