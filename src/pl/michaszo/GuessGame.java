package pl.michaszo;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static GuessGame instance;
    private int roundsPerGame = 10;
    private int score = 0;

    public GuessGame() {
    }

    public void play() {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int roundCounter = 1;
        int toGuess;
        int userType;

        while (roundCounter <= roundsPerGame) {

            System.out.println("Runda " + roundCounter + ".");
            toGuess = rand.nextInt(10);
            System.out.print("Podaj liczbę: ");
            userType = scanner.nextInt();

            if (userType == toGuess) {
                this.score++;
            }
            
            roundCounter++;
        }

    }

    public int getScore() {
        return this.score;
    }

    public static GuessGame getInstance() {

        if (instance == null) {
            synchronized (GuessGame.class) {
                instance = new GuessGame();
            }
        }
        return instance;
    }
}
