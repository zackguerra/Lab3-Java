public class Queen extends Piece {

    public Queen (){
        super(true, 9);
    }
    public Queen (boolean white){
        super(white,1);
    }
    @Override
    public void Move() {
        System.out.println("Like bishop and rook");
    }
    @Override
    public String toString() {
        return "Queen{value = "+ getValue() +"}";
    }
}
