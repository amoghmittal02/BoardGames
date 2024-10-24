//A basic board game class which can be used for multiple games having general attributes like board, players, game mode (single player or multiplayer)
//Contains methods like play, resetBoard, displayScores and isBoardFull check
import java.util.Random;
import java.util.Scanner;

public abstract class BoardGame {
    protected Board board;
    protected Player[] players;
    protected Scanner scanner;
    protected Random random;
    protected boolean isSinglePlayer;

    public BoardGame(int boardSize, Player player1, Player player2, boolean isSinglePlayer) {
        this.board = new Board(boardSize);
        this.players = new Player[]{player1, player2};
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.isSinglePlayer = isSinglePlayer;
    }

    public abstract void play();

    protected boolean isBoardFull() {
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                if (board.getPiece(i, j) == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void resetBoard() {
        board.clearBoard();
    }

    public void displayScores() {
        System.out.println("Scores:");
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getScore());
        }
    }
}