public class Knight extends Piece {

    public Knight (){
        super(true, 2);
    }
    public Knight (boolean white){
        super(white,1);
    }
    @Override
    public void Move() {
        System.out.println("Like an L");
    }
    @Override
    public String toString() {
        return "Knight{value = "+ getValue() +"}";
    }
}
