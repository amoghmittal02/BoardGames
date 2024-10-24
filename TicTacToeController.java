import java.util.Scanner;

//  Tic Tac Toe Controller extends the Board Game class
public class TicTacToeController extends BoardGame {
    private int currentPlayerIndex;

    public TicTacToeController(Player player1, Player player2, boolean isSinglePlayer) {


        super(getBoardsize(), player1, player2, isSinglePlayer);
        this.currentPlayerIndex = 0;
    }


    private static int getBoardsize() {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter board size (3-10): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input!");
                System.out.print("Enter board size (1-10): ");
                scanner.next();
            }
            size = scanner.nextInt();
        } while (size < 3 || size > 10);
        return size;
    }

    @Override
    public void play()
        {
            while (true) {
                board.printBoard();
                Player current = players[currentPlayerIndex];
                System.out.println(current.getName() + "'s turn (" + current.getSymbol() + ")");
                int row, col;
                if (isSinglePlayer && currentPlayerIndex == 1) {

                    // CPU's turn (random move)
                    do {
                        row = random.nextInt(board.getSize());
                        col = random.nextInt(board.getSize());
                    } while (!board.placePiece(row, col, new Piece(current.getSymbol())));
                    System.out.println("CPU placed at: " + row + ", " + col);
                } else {

                    // Multiplayer mode, player 2's turn
                    do {
                        System.out.print("Enter row and column (0-" + (board.getSize() - 1) + "): ");
                        row = scanner.nextInt();
                        col = scanner.nextInt();
                    } while (!board.placePiece(row, col, new Piece(current.getSymbol())));
                }

                if (hasWon(row, col)) {
                    board.printBoard();
                    System.out.println(current.getName() + " wins!");
                    current.increaseScore();
                    break;
                }

                if (isBoardFull()) {
                    board.printBoard();
                    System.out.println("It's a draw!");
                    break;
                }

                currentPlayerIndex = 1 - currentPlayerIndex;
            }
        }


    //Win check
    private boolean hasWon(int row, int col)
        {
            char symbol = board.getPiece(row, col).getSymbol();

            // Row check
            boolean won = true;
            for (int i = 0; i < board.getSize(); i++) {
                if (board.getPiece(row, i) == null || board.getPiece(row, i).getSymbol() != symbol) {
                    won = false;
                    break;
                }
            }
            if (won) return true;


            // Column check
            won = true;
            for (int i = 0; i < board.getSize(); i++) {
                if (board.getPiece(i, col) == null || board.getPiece(i, col).getSymbol() != symbol) {
                    won = false;
                    break;
                }
            }
            if (won) return true;

            // Diagonal check
            if (row == col) {
                won = true;
                for (int i = 0; i < board.getSize(); i++) {
                    if (board.getPiece(i, i) == null || board.getPiece(i, i).getSymbol() != symbol) {
                        won = false;
                        break;
                    }
                }
                if (won) return true;
            }

            if (row + col == board.getSize() - 1) {
                won = true;
                for (int i = 0; i < board.getSize(); i++) {
                    if (board.getPiece(i, board.getSize() - 1 - i) == null || board.getPiece(i, board.getSize() - 1 - i).getSymbol() != symbol) {
                        won = false;
                        break;
                    }
                }
                if (won) return true;
            }

            return false;
        }

    //Print the scores
    @Override
    public void displayScores() {
        super.displayScores();
    }

    //Reset the board
    @Override
    public void resetBoard() {
        super.resetBoard();
        currentPlayerIndex = 0;
    }
}
