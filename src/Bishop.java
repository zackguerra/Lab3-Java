public class Bishop extends Piece {

    public Bishop (){
        super(true, 3);
    }
    public Bishop (boolean white){
        super(white,1);
    }
    @Override
    public void Move() {
        System.out.println("Diagonally");
    }
    @Override
    public String toString() {
        return "Bishop{value = "+ getValue() +"}";
    }
}
