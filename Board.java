//Board class is a general class that can be used for any board game with 'n x n' number of tiles
//It has a placePiece method which sets a piece value and makes sure there is no invalid move

public class Board {
    private Piece[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        board = new Piece[size][size];
    }

    //Sets the piece
    public boolean placePiece(int row, int col, Piece piece) {
        if (row < 0 || row >= size || col < 0 || col >= size || board[row][col] != null) {
            System.out.println("Invalid move!");
            return false;
        }
        board[row][col] = piece;
        return true;
    }

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public int getSize() {
        return size;
    }

    //Print board
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getSymbol() + " ");
                }
                else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    //Clear board content
    public void clearBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = null;
            }
        }
    }
}
