//Main class, executes the game by calling the playGame method from gameAdmin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameAdmin gameAdmin = new GameAdmin();
        gameAdmin.playGame();
    }
}