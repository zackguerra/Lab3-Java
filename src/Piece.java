import java.util.Objects;

public abstract class Piece {

    private int value;
    private boolean isWhite;

    public Piece(boolean isWhite, int value) {
        this.isWhite = isWhite;
        this.value = value;
    }

    public abstract void Move();

    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        return this.value == ((Piece)o).getValue() && ((Piece)o).isWhite() == this.isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isWhite() {
        return isWhite;
    }




}