//Piece class is just a basic one with symbol as it's only attribute can extend this to color, shape etc in future games
public class Piece {
    private char symbol;

    public Piece(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
