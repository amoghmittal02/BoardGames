import java.util.Scanner;

public class GameAdmin {
    private Scanner scanner;
    private TicTacToeController ticTacToe;
    private OrderAndChaosController orderAndChaos;
    private Player p1;
    private Player p2;
    private boolean isSinglePlayer;

    public GameAdmin() {
        scanner = new Scanner(System.in);
    }

    public void playGame() {
        System.out.println("Welcome!");

        while (true) {
            System.out.println("1. Tic Tac Toe");
            System.out.println("2. Order and Chaos");
            System.out.println("Q. Quit game");
            System.out.print("Choose one from (1, 2 or Q): ");
            String gameChoice = scanner.nextLine().toUpperCase();

            if (gameChoice.equals("Q")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!gameChoice.equals("1") && !gameChoice.equals("2")) {
                System.out.println("Invalid choice, try again!");
                continue;
            }

            System.out.println("1. Single Player");
            System.out.println("2. Multiplayer");
            System.out.print("Choose a game mode (1 or 2): ");
            isSinglePlayer = scanner.nextLine().equals("1");

            if (p1 == null) {
                System.out.print("Enter Player 1 name: ");
                String player1Name = scanner.nextLine();
                p1 = new Player(player1Name, 'X');
            }

            if (p2 == null) {
                if (isSinglePlayer) {
                    p2 = new Player("CPU", 'O');
                } else {
                    System.out.print("Enter Player 2 name: ");
                    String player2Name = scanner.nextLine();
                    p2 = new Player(player2Name, 'O');
                }
            }

            if (gameChoice.equals("1")) {
                playTicTacToe();
            } else {
                playOrderAndChaos();
            }

            System.out.println("Game Over!");
            System.out.println("Press Enter to continue or 'Q' to quit");
            if (scanner.nextLine().toUpperCase().equals("Q")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }

    private void playTicTacToe() {
        if (ticTacToe == null) {
            ticTacToe = new TicTacToeController(p1, p2, isSinglePlayer);
        } else {
            ticTacToe.resetBoard();
        }
        ticTacToe.play();
        ticTacToe.displayScores();
    }

    private void playOrderAndChaos() {
        if (orderAndChaos == null) {
            orderAndChaos = new OrderAndChaosController(p1, p2, isSinglePlayer);
        } else {
            orderAndChaos.resetBoard();
        }
        orderAndChaos.play();
        orderAndChaos.displayScores();
    }
}
