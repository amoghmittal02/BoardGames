//Order and Chaos Controller extends the Board Game class

public class OrderAndChaosController extends BoardGame {
    private Player orderPlayer;
    private Player chaosPlayer;

    public OrderAndChaosController(Player orderPlayer, Player chaosPlayer, boolean isSinglePlayer) {
        super(6, orderPlayer, chaosPlayer, isSinglePlayer);
        this.orderPlayer = orderPlayer;
        this.chaosPlayer = chaosPlayer;
    }

    @Override
    public void play()
        {
            Player current = orderPlayer;
            while (true) {
                board.printBoard();
                System.out.println(current.getName() + "'s turn");
                int row, col;
                char symbol;
                if (isSinglePlayer && current == chaosPlayer) {

                    // CPU's turn (random move)
                    do {
                        row = random.nextInt(board.getSize());
                        col = random.nextInt(board.getSize());
                        symbol = random.nextBoolean() ? 'X' : 'O';
                    } while (!board.placePiece(row, col, new Piece(symbol)));
                    System.out.println("CPU placed " + symbol + " at: " + row + ", " + col);
                } else {

                    // Multiplayer mode, player 2's turn
                    do {
                        System.out.print("Enter row and column (0-5): ");
                        row = scanner.nextInt();
                        col = scanner.nextInt();
                        System.out.print("Enter symbol (X or O): ");
                        symbol = scanner.next().toUpperCase().charAt(0);
                    } while (!board.placePiece(row, col, new Piece(symbol)) || (symbol != 'X' && symbol != 'O'));
                }

                if (hasWon()) {
                    board.printBoard();
                    System.out.println("Order wins!");
                    orderPlayer.increaseScore();
                    break;
                }

                if (isBoardFull()) {
                    board.printBoard();
                    System.out.println("Chaos wins!");
                    chaosPlayer.increaseScore();
                    break;
                }

                if(current == orderPlayer) {
                    current = chaosPlayer;
                }
                else{
                    current = orderPlayer;
                }

            }
        }

   //Win check
    private boolean hasWon() {
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                if (lineCheck(i, j, 0, 1) || lineCheck(i, j, 1, 0) || lineCheck(i, j, 1, 1) || lineCheck(i, j, 1, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Checking for 5 consecutive same symbols : horizontally, vertically and diagonally

    private boolean lineCheck(int row, int col, int dRow, int dCol)
        {
            if (col + 4 * dCol >= board.getSize() || col + 4 * dCol < 0 || row + 4 * dRow >= board.getSize() || row + 4 * dRow < 0) {
                return false;
            }

            char symbol = board.getPiece(row, col) != null ? board.getPiece(row, col).getSymbol() : '-';
            if (symbol == '-') return false;
            for (int i = 1; i < 5; i++) {
                if (board.getPiece(row + i * dRow, col + i * dCol) == null || board.getPiece(row + i * dRow, col + i * dCol).getSymbol() != symbol) {
                    return false;
                }
            }
            return true;
        }

    //Reset Board

    @Override
    public void resetBoard() {
        super.resetBoard();
    }


    //Print the scores
    @Override
    public void displayScores() {
        System.out.println("Scores:");
        System.out.println(orderPlayer.getName() + " (Order): " + orderPlayer.getScore());
        System.out.println(chaosPlayer.getName() + " (Chaos): " + chaosPlayer.getScore());
    }
}