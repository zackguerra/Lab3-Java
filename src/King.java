public class King extends Piece {

    public King (){
        super(true, 1000);
    }
    public King (boolean white){
        super(white,1);
    }
    @Override
    public void Move() {
        System.out.println("One square");
    }
    @Override
    public String toString() {
        return "King{value = "+ getValue() +"}";
    }
}
